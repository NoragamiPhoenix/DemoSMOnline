create  database SMOnline
go

use SMOnline
go

create table Categories
(
	CateID int identity(1,1) primary key,
	CateNameEn varchar(50),
	CateNameVn nvarchar(50),
	CateDescEn varchar(300),
	CateDescVn nvarchar(300)
)
go
insert into Categories values('Health and Beauty',N'Sức khỏe và sắc đẹp','Health...',N'Sức khỏe và...'),
							('Electrolic devices',N'Thiết bị điện tử','Electrolic deviecs .....',N'Thiết bị điện tử...'),
							('Victuals',N'Thực phẩm','Foods and Drinks....',N'Thức uống và đồ ăn')
go
create table SubCategories
(
	SubCateID int identity(1,1) primary key,
	CateID int constraint FK_Categories foreign key references Categories(CateID),
	SubCateNameEn varchar(50) unique,
	SubCateNameVn nvarchar(50) unique,
	SubCateDescEn varchar(300),
	SubCateDescVn nvarchar(300)
)
go

insert into SubCategories values(1,'Face & Body Skincare',N'Chăm sóc da toàn thân và mặt','abc',N'ABC'),
								(1,'Haircare',N'Chăm sóc tóc','Haircare...',N'Chăm sóc tóc..'),
								(1,'Vitamins',N'Dưỡng chất','Vitamins',N'Dưỡng chất'),
								(2,'Hand devices',N'Thiết bị cầm tay','Hand devices...',N'Thiết bị cầm tay'),
								(2,'Computer',N'Máy tính','Computer...',N'Máy tính...'),
								(3,'Foods',N'Đồ ăn','Foods',N'Đồ ăn...'),
								(3,'Drinks',N'Đồ uống','Drinks',N'Đồ uống..')


go
create table ProductType
(
	TypeID int identity(1,1) primary key,
	SubCateID int constraint FK_SubCategories foreign key references SubCategories(SubCateID),
	TypeEn varchar(50),
	TypeVn nvarchar(50),
	TypeDescEn varchar(300),
	TypeDescVn nvarchar(300)
)
go

insert into ProductType values(1,'Face Mask',N'Mặt nạ','Face Mask...',N'Mặt nạ...'),
							  (1,'Face Wash & Scrub',N'Sữa rửa mặt và tẩy da','Face Wash & Scrub',N'Sữa rửa mặt và tẩy da...'),
							  (2,'Conditioner',N'Dầu dưỡng tóc','Conditioneer....',N'Dầu dưỡng tóc...'),
							  (2,'Shampoo',N'Shampoo','Shampoo...',N'Shampoo..'),
							  (2,'Colour Haircare',N'Thuốc nhuộm màu tóc','Colour Haircare...',N'Thuốc nhuộm tóc màu...'),
							  (4,'Cell Phone',N'Điện thoại cũ','Cell phone',N'Điện thoại cũ'),
							  (4,'Smart Phone',N'Điện thoại thông minh','Smart phone',N'Điện thoại thông minh'),
							  (4,'Camera',N'Camera','Camera',N'Camera')
go
create table Supplier
(
	SupplyID int identity(1,1) primary key,
	SupplyName nvarchar(50) unique,
	SupplyLogo varchar(60)
)
go
	insert into Supplier values('Apple','images/logo/apple.png'),
							   ('Sony','images/logo/sony.png'),
							   ('Samsung','images/logo/samsung.png')
go
create table Products
(
	ProductID int identity(1,1) primary key,
	TypeID int constraint FK_ProductType foreign key references ProductType(TypeID),
	SupplyID int constraint FK_Supplier foreign key references Supplier(SupplyID),
	ProductNameVn nvarchar(50),
	ProductDiscribe nvarchar(500),
	ProductPrice float,
	ProductUnit nvarchar(50),
	ProductQuanlity int,
	ProductImage varchar(60),
	ProductDiscount int,
	ProductRating float,
	ProductStatus varchar(1) default('1')
)
go
	insert into Products values(6,1,N'Iphone 4s','Iphone 4s',2100,'Cái',20,'images/products/electrolic/handdevices/iphone4.png',0,4,'1'),
								(6,1,N'Iphone 5','Iphone 5',3500,'Cái',20,'images/products/electrolic/handdevices/iphone5.png',0,4.5,'1'),
								(6,3,N'Samsung note4','Samsung note4',2500,'Cái',15,'images/products/electrolic/handdevices/samsungNote4.png',5,4,'1'),
								(6,2,N'Sony experia 1','Sony Experia1',1500,'Cái',10,'images/products/electrolic/handdevices/sonyExperia1.png',0,3,'1'),
								(7,1,N'Iphone 6s','Iphone 6s',13500,'Cái',10,'images/products/electrolic/handdevices/iphone6s.png',0,4.5,'1'),
								(7,1,N'Iphone 7s','Iphone 7s',2100,'Cái',20,'images/products/electrolic/handdevices/iphone7s.png',0,4,'1'),
								(8,2,N'Camera Cannon dream','Camera Cannon dream',2100,'Cái',2,'images/products/electrolic/handdevices/cameraCanoonDream.png',0,4,'1')
go

create table Customer
(
	CustomerID int identity(1,1) primary key,
	CustomerName nvarchar(60),
	CustomerPhone varchar(12),
	CustomerEmail varchar(50),
	CustomerPassword varchar(30),
	CustomerPoint int,
	CustomerStatus varchar(1) default('1')
)
go

insert into Customer values(N'Đoàn Minh trí','01234121311','minhtri@gmail.com','minhtri',10,'1'),
							(N'Lê Khuyên','0169292121','lekhuyen@gmail.com','lekhuyen',5,'1'),
							(N'Phụng Hoàng','01231112223','phunghoang@gmail.com','phunghoang',10,'1'),
							(N'Hoàng Đăng','01668604015','hoangdang@gmail.com','hoangdang',10,'1')

go
create table CustomerAddress
(
	CustomerAddressId int identity(1,1) primary key,
	CustomerID int foreign key references Customer(CustomerID),
	CustomerAddressDistance float,
	CustomerAddressDetail	nvarchar(150)
)

go

insert into CustomerAddress values(1,25.3,N'15B Nguyễn Lương Bằng Tân phú, Quận 7, Hồ Chí Minh, Việt Nam'),
								  (2,10.2,N'47 Thống Nhất phường 10, Gò Vấp, Hồ Chí Minh, Việt Nam'),
								  (3,5.3,N'420 Văn Tần phường 5, Quận 3, Hồ Chí Minh, Việt Nam'),
								  (4,12.6,N'2C Hẻm 305 Lê Văn Qưới phường Bình Trị Đông, Bình Tân, Hồ Chí Minh, Việt Nam')

go


create table PointDiscount
(
	PointDiscountID int identity(1,1) primary key,
	CusPoint int unique,
	DiscountPercent int unique
)
go

create table ProductsCommentRating
(
	CommentID int identity(1,1) primary key,
	CustomerID int constraint FK_Customer foreign key references Customer(CustomerID),
	ProductID int constraint FK_Productss foreign key references Products(ProductID),
	CommentText nvarchar(300),
	CustomerRating varchar(1) default('-1')
)
go

create table ProductsEditHistory
(
	EditID int identity(1,1) primary key,
	ProductID int foreign key references Products(ProductID),
	TypeID int,
	SupplyID int,
	ProductName nvarchar(50),
	ProductPrice int,
	ProductUnit nvarchar(50),
	ProductImage varchar(60),
	ProductDiscount int,
	ProductEditTime datetime,
)
go

create table OrderMaster
(
	OrderMID int identity(1,1) primary key,
	CustomerID int constraint FK_CustomerOD foreign key references Customer(CustomerID),
	OMDate date
)
go

create table OrderDetails
(
	OrderMID int constraint FK_OrderMaster foreign key references OrderMaster(OrderMID),
	ProductID int foreign key references Products(ProductID),
	ODTime datetime,
	DiscountPercent int,
	Quantity int,
	constraint fk_Or_Pro primary key(OrderMID,ProductID)
)
go


create table Staff
(
	StaffID			int identity(1,1) primary key,
	StaffName		nvarchar(30),
	StaffPhone		varchar(12),
	StaffEmail		varchar(20),
	StaffPassword	varchar(13),
	StaffLevel		varchar(1) default('1'),
	StaffRole		varchar(1) default('0')
)

go

create table News
(
	NewsID int identity(1,1) primary key,
	NewsDate datetime,
	StaffID int constraint FK_Staff foreign key references Staff(StaffID),
	NewsText varchar(500),
	NewsImage varchar(60)
)