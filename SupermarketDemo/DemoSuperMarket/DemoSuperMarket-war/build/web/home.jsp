
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>

<html>

    <head>

        <!-- Meta Tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Title -->
        <title>HomeShop - HTML Template</title>

        <!-- Fonts -->
        <link href='http://fonts.googleapis.com/css?family=Roboto:400,300,300italic,400italic,500,700,900,700italic,500italic' rel='stylesheet' type='text/css'>

        <!-- Stylesheets -->
        <link rel="stylesheet" href="resource/css/bootstrap.min.css">
        <link rel="stylesheet" href="resource/css/perfect-scrollbar.css">
        <link rel="stylesheet" href="resource/css/style.css">
        <link rel="stylesheet" href="resource/css/flexslider.css" type="text/css" media="screen" />
        <link rel="stylesheet" href="resource/css/fontello.css">
        <link rel="stylesheet" type="text/css" href="resource/css/settings.css" media="screen" />
        <link rel="stylesheet" href="resource/css/animation.css">
        <link rel="stylesheet" href="resource/css/owl.carousel.css">
        <link rel="stylesheet" href="resource/css/owl.theme.css">
        <link rel="stylesheet" href="resource/css/chosen.css">

        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
                        <link rel="stylesheet" href="css/ie.css">
        <![endif]-->
        <!--[if IE 7]>
                <link rel="stylesheet" href="css/fontello-ie7.css">
        <![endif]-->

    </head>


    <body>

        <!-- Container -->
        <div class="container">

            <!-- Header-->
            <c:import url="header.jsp"/>
            <!--End Header-->

            <!-- Content -->
            <div class="row content">

                <!-- Main Content -->
                <section class="main-content col-lg-9 col-md-9 col-sm-9 col-lg-push-3 col-md-push-3 col-sm-push-3">

                    <section class="slider">
                        <div class="tp-banner-container">
                            <div class="tp-banner" >
                                <ul>
                                    <!-- SLIDE  -->
                                    <li data-transition="fade" data-slotamount="7" data-masterspeed="1500" >
                                        <!-- MAIN IMAGE -->
                                        <img src="resource/img/slide1.jpg"  alt="slidebg1"  data-bgfit="cover" data-bgposition="left top" data-bgrepeat="no-repeat">
                                        <!-- LAYERS -->
                                        <div class="tp-caption skewfromrightshort fadeout"
                                             data-x="40"
                                             data-y="60"
                                             data-speed="500"
                                             data-start="1200"
                                             data-easing="Power4.easeOut"><h2><strong>Lorem Ipsum Dolor</strong></h2>
                                        </div>
                                        <div class="tp-caption skewfromrightshort fadeout"
                                             data-x="40"
                                             data-y="140"
                                             data-speed="500"
                                             data-start="1200"
                                             data-easing="Power4.easeOut"><h3>All the power in your hands!</h3>
                                        </div>
                                        <div class="tp-caption skewfromrightshort fadeout"
                                             data-x="40"
                                             data-y="250"
                                             data-speed="500"
                                             data-start="1200"
                                             data-easing="Power4.easeOut"><span>From <span class="price">$960.00</span></span>
                                        </div>
                                        <div class="tp-caption skewfromrightshort fadeout"
                                             data-x="40"
                                             data-y="300"
                                             data-speed="500"
                                             data-start="1200"
                                             data-easing="Power4.easeOut"><a class="button big red" href="#">Buy Now</a>
                                        </div>
                                    </li>
                                    <!-- SLIDE  -->
                                    <li data-transition="zoomout" data-slotamount="7" data-masterspeed="1000" >
                                        <!-- MAIN IMAGE -->
                                        <img src="resource/img/slide3.jpg"  alt="darkblurbg"  data-bgfit="cover" data-bgposition="left top" data-bgrepeat="no-repeat">
                                        <!-- LAYERS -->
                                        <div class="tp-caption skewfromrightshort fadeout"
                                             data-x="40"
                                             data-y="60"
                                             data-speed="500"
                                             data-start="1200"
                                             data-easing="Power4.easeOut"><h2><strong>The New Studio<br>Original Headphones</strong></h2>
                                        </div>
                                        <div class="tp-caption skewfromrightshort fadeout"
                                             data-x="40"
                                             data-y="190"
                                             data-speed="500"
                                             data-start="1200"
                                             data-easing="Power4.easeOut"><h3>Lorem ipsum dolor</h3>
                                        </div>
                                        <div class="tp-caption skewfromrightshort fadeout"
                                             data-x="40"
                                             data-y="300"
                                             data-speed="500"
                                             data-start="1200"
                                             data-easing="Power4.easeOut"><span>Only <span class="price">$399.00</span></span>
                                        </div>
                                        <div class="tp-caption skewfromrightshort fadeout"
                                             data-x="40"
                                             data-y="347"
                                             data-speed="500"
                                             data-start="1200"
                                             data-easing="Power4.easeOut"><a class="button big red" href="#">Shop Now</a>
                                        </div>
                                    </li>
                                    <!-- SLIDE  -->
                                    <li data-transition="zoomout" data-slotamount="7" data-masterspeed="1000" >
                                        <!-- MAIN IMAGE -->
                                        <img src="resource/img/slide2.jpg"  alt="darkblurbg"  data-bgfit="cover" data-bgposition="left top" data-bgrepeat="no-repeat">
                                        <!-- LAYERS -->
                                        <div class="tp-caption skewfromrightshort fadeout"
                                             data-x="40"
                                             data-y="60"
                                             data-speed="500"
                                             data-start="1200"
                                             data-easing="Power4.easeOut"><h2>The New <strong>Laptop</strong></h2>
                                        </div>
                                        <div class="tp-caption skewfromrightshort fadeout"
                                             data-x="40"
                                             data-y="140"
                                             data-speed="500"
                                             data-start="1200"
                                             data-easing="Power4.easeOut"><h3>All the power in your hands!</h3>
                                        </div>
                                        <div class="tp-caption skewfromrightshort fadeout"
                                             data-x="40"
                                             data-y="250"
                                             data-speed="500"
                                             data-start="1200"
                                             data-easing="Power4.easeOut"><span>From <span class="price">$990.00</span></span>
                                        </div>
                                        <div class="tp-caption skewfromrightshort fadeout"
                                             data-x="40"
                                             data-y="300"
                                             data-speed="500"
                                             data-start="1200"
                                             data-easing="Power4.easeOut"><a class="button big red" href="#">Buy Now</a>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </section>



                    <!-- Featured Products -->
                    <div class="products-row row">

                        <!-- Carousel Heading -->
                        <div class="col-lg-12 col-md-12 col-sm-12">

                            <div class="carousel-heading">
                                <h4>Featured Products</h4>
                                <div class="carousel-arrows">
                                    <i class="icons icon-left-dir"></i>
                                    <i class="icons icon-right-dir"></i>
                                </div>
                            </div>

                        </div>
                        <!-- /Carousel Heading -->

                        <!-- Carousel -->
                        <div class="carousel owl-carousel-wrap col-lg-12 col-md-12 col-sm-12">

                            <div class="owl-carousel" data-max-items="3">

                                <!-- Slide -->
                                <div>
                                    <!-- Carousel Item -->
                                    <div class="product">

                                        <div class="product-image">
                                            <img src="resource/img/products/sample1.jpg" alt="Product1">
                                            <a href="products_page_v1.html" class="product-hover">
                                                <i class="icons icon-eye-1"></i> Quick View
                                            </a>
                                        </div>

                                        <div class="product-info">
                                            <h5><a href="products_page_v1.html">Lorem ipsum dolor sit amet</a></h5>
                                            <span class="price">$281.00</span>
                                            <div class="rating readonly-rating" data-score="4"></div>
                                        </div>

                                        <div class="product-actions">
                                            <span class="add-to-cart">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-basket-2"></i>
                                                    <span class="action-name">Add to cart</span>
                                                </span >
                                            </span>
                                            <span class="add-to-favorites">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-heart-empty"></i>
                                                    <span class="action-name">Add to wishlist</span>
                                                </span>
                                            </span>
                                            <span class="add-to-compare">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-docs"></i>
                                                    <span class="action-name">Add to Compare</span>
                                                </span>
                                            </span>
                                        </div>

                                    </div>
                                    <!-- /Carousel Item -->
                                </div>
                                <!-- /Slide -->


                                <!-- Slide -->
                                <div>
                                    <!-- Carousel Item -->
                                    <div class="product">

                                        <div class="product-image">
                                            <span class="product-tag">Sale</span>
                                            <img src="resource/img/products/sample2.jpg" alt="Product1">
                                            <a href="products_page_v1.html" class="product-hover">
                                                <i class="icons icon-eye-1"></i> Quick View
                                            </a>
                                        </div>

                                        <div class="product-info">
                                            <h5><a href="products_page_v1.html">Lorem ipsum dolor sit amet</a></h5>
                                            <span class="price">$281.00</span>
                                            <div class="rating readonly-rating" data-score="4"></div>
                                        </div>

                                        <div class="product-actions">
                                            <span class="add-to-cart">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-basket-2"></i>
                                                    <span class="action-name">Add to cart</span>
                                                </span >
                                            </span>
                                            <span class="add-to-favorites">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-heart-empty"></i>
                                                    <span class="action-name">Add to wishlist</span>
                                                </span>
                                            </span>
                                            <span class="add-to-compare">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-docs"></i>
                                                    <span class="action-name">Add to Compare</span>
                                                </span>
                                            </span>
                                        </div>

                                    </div>
                                    <!-- /Carousel Item -->
                                </div>
                                <!-- /Slide -->



                                <!-- Slide -->
                                <div>
                                    <!-- Carousel Item -->
                                    <div class="product">

                                        <div class="product-image">
                                            <img src="resource/img/products/sample3.jpg" alt="Product1">
                                            <a href="products_page_v1.html" class="product-hover">
                                                <i class="icons icon-eye-1"></i> Quick View
                                            </a>
                                        </div>

                                        <div class="product-info">
                                            <h5><a href="products_page_v1.html">Lorem ipsum dolor sit amet</a></h5>
                                            <span class="price">$281.00</span>
                                            <div class="rating readonly-rating" data-score="4"></div>
                                        </div>

                                        <div class="product-actions">
                                            <span class="add-to-cart">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-basket-2"></i>
                                                    <span class="action-name">Add to cart</span>
                                                </span >
                                            </span>
                                            <span class="add-to-favorites">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-heart-empty"></i>
                                                    <span class="action-name">Add to wishlist</span>
                                                </span>
                                            </span>
                                            <span class="add-to-compare">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-docs"></i>
                                                    <span class="action-name">Add to Compare</span>
                                                </span>
                                            </span>
                                        </div>

                                    </div>
                                    <!-- /Carousel Item -->
                                </div>
                                <!-- /Slide -->




                                <!-- Slide -->
                                <div>
                                    <!-- Carousel Item -->
                                    <div class="product">

                                        <div class="product-image">
                                            <img src="resource/img/products/sample1.jpg" alt="Product1">
                                            <a href="products_page_v1.html" class="product-hover">
                                                <i class="icons icon-eye-1"></i> Quick View
                                            </a>
                                        </div>

                                        <div class="product-info">
                                            <h5><a href="products_page_v1.html">Lorem ipsum dolor sit amet</a></h5>
                                            <span class="price">$281.00</span>
                                            <div class="rating readonly-rating" data-score="4"></div>
                                        </div>

                                        <div class="product-actions">
                                            <span class="add-to-cart">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-basket-2"></i>
                                                    <span class="action-name">Add to cart</span>
                                                </span >
                                            </span>
                                            <span class="add-to-favorites">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-heart-empty"></i>
                                                    <span class="action-name">Add to wishlist</span>
                                                </span>
                                            </span>
                                            <span class="add-to-compare">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-docs"></i>
                                                    <span class="action-name">Add to Compare</span>
                                                </span>
                                            </span>
                                        </div>

                                    </div>
                                    <!-- /Carousel Item -->
                                </div>
                                <!-- /Slide -->




                                <!-- Slide -->
                                <div>
                                    <!-- Carousel Item -->
                                    <div class="product">

                                        <div class="product-image">
                                            <img src="resource/img/products/sample2.jpg" alt="Product1">
                                            <a href="products_page_v1.html" class="product-hover">
                                                <i class="icons icon-eye-1"></i> Quick View
                                            </a>
                                        </div>

                                        <div class="product-info">
                                            <h5><a href="products_page_v1.html">Lorem ipsum dolor sit amet</a></h5>
                                            <span class="price">$281.00</span>
                                            <div class="rating readonly-rating" data-score="4"></div>
                                        </div>

                                        <div class="product-actions">
                                            <span class="add-to-cart">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-basket-2"></i>
                                                    <span class="action-name">Add to cart</span>
                                                </span >
                                            </span>
                                            <span class="add-to-favorites">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-heart-empty"></i>
                                                    <span class="action-name">Add to wishlist</span>
                                                </span>
                                            </span>
                                            <span class="add-to-compare">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-docs"></i>
                                                    <span class="action-name">Add to Compare</span>
                                                </span>
                                            </span>
                                        </div>

                                    </div>
                                    <!-- /Carousel Item -->
                                </div>
                                <!-- /Slide -->





                                <!-- Slide -->
                                <div>
                                    <!-- Carousel Item -->
                                    <div class="product">

                                        <div class="product-image">
                                            <img src="resource/img/products/sample3.jpg" alt="Product1">
                                            <a href="products_page_v1.html" class="product-hover">
                                                <i class="icons icon-eye-1"></i> Quick View
                                            </a>
                                        </div>

                                        <div class="product-info">
                                            <h5><a href="products_page_v1.html">Lorem ipsum dolor sit amet</a></h5>
                                            <span class="price">$281.00</span>
                                            <div class="rating readonly-rating" data-score="4"></div>
                                        </div>

                                        <div class="product-actions">
                                            <span class="add-to-cart">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-basket-2"></i>
                                                    <span class="action-name">Add to cart</span>
                                                </span >
                                            </span>
                                            <span class="add-to-favorites">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-heart-empty"></i>
                                                    <span class="action-name">Add to wishlist</span>
                                                </span>
                                            </span>
                                            <span class="add-to-compare">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-docs"></i>
                                                    <span class="action-name">Add to Compare</span>
                                                </span>
                                            </span>
                                        </div>

                                    </div>
                                    <!-- /Carousel Item -->
                                </div>
                                <!-- /Slide -->


                            </div>
                        </div>
                        <!-- /Carousel -->

                    </div>
                    <!-- /Featured Products -->




                    <!-- New Collection -->
                    <div class="products-row row">

                        <!-- Carousel Heading -->
                        <div class="col-lg-12 col-md-12 col-sm-12">

                            <div class="carousel-heading">
                                <h4>New Collection</h4>
                                <div class="carousel-arrows">
                                    <i class="icons icon-left-dir"></i>
                                    <i class="icons icon-right-dir"></i>
                                </div>
                            </div>

                        </div>
                        <!-- /Carousel Heading -->

                        <!-- Carousel -->
                        <div class="carousel owl-carousel-wrap col-lg-12 col-md-12 col-sm-12">

                            <div class="owl-carousel" data-max-items="3">

                                <!-- Slide -->
                                <c:forEach var="p" items="${list}">
                                <div>
                                    <!-- Carousel Item -->
                                    <div class="product">

                                        <div class="product-image">
                                            <span class="product-tag">Sale</span>
                                            <img src="${p.productImage}" alt="${p.productNameVn}">
                                            <a href="products_page_v1.html" class="product-hover">
                                                <i class="icons icon-eye-1"></i> Quick View
                                            </a>
                                        </div>

                                        <div class="product-info">
                                            <h5><a href="products_page_v1.html?proID=${p.productID}">${p.productNameVn}</a></h5>
                                            <span class="price">${p.productPrice}</span>
                                            <div class="rating readonly-rating" data-score="4"></div>
                                        </div>

                                        <div class="product-actions">
                                            <span class="add-to-cart">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-basket-2"></i>
                                                    <a href="AddToCart?proID=${p.productID}">
                                                        <span class="action-name">Add to cart</span></a>
                                                </span>
                                            </span>
                                            <span class="add-to-favorites">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-heart-empty"></i>
                                                    <span class="action-name">Add to wishlist</span>
                                                </span>
                                            </span>
                                            <span class="add-to-compare">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-docs"></i>
                                                    <span class="action-name">Add to Compare</span>
                                                </span>
                                            </span>
                                        </div>

                                    </div>
                                    <!-- /Carousel Item -->
                                </div>
                                </c:forEach>
                                <!-- /Slide -->
                                <!-- /Slide -->


                            </div>
                        </div>
                        <!-- /Carousel -->

                    </div>
                    <!-- /New Collection -->





                    <!-- Random Products -->
                    <div class="products-row row">

                        <!-- Carousel Heading -->
                        <div class="col-lg-12 col-md-12 col-sm-12">

                            <div class="carousel-heading">
                                <h4>Random Products</h4>
                                <div class="carousel-arrows">
                                    <i class="icons icon-left-dir"></i>
                                    <i class="icons icon-right-dir"></i>
                                </div>
                            </div>

                        </div>
                        <!-- /Carousel Heading -->

                        <!-- Carousel -->
                        <div class="carousel owl-carousel-wrap col-lg-12 col-md-12 col-sm-12">

                            <div class="owl-carousel" data-max-items="3">

                                <!-- Slide -->
                                <div>
                                    <!-- Carousel Item -->
                                    <div class="product">

                                        <div class="product-image">
                                            <img src="resource/img/products/sample7.jpg" alt="Product1">
                                            <a href="products_page_v1.html" class="product-hover">
                                                <i class="icons icon-eye-1"></i> Quick View
                                            </a>
                                        </div>

                                        <div class="product-info">
                                            <h5><a href="products_page_v1.html">Lorem ipsum dolor sit amet</a></h5>
                                            <span class="price">$281.00</span>
                                            <div class="rating readonly-rating" data-score="4"></div>
                                        </div>

                                        <div class="product-actions">
                                            <span class="add-to-cart">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-basket-2"></i>
                                                    <span class="action-name">Add to cart</span>
                                                </span >
                                            </span>
                                            <span class="add-to-favorites">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-heart-empty"></i>
                                                    <span class="action-name">Add to wishlist</span>
                                                </span>
                                            </span>
                                            <span class="add-to-compare">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-docs"></i>
                                                    <span class="action-name">Add to Compare</span>
                                                </span>
                                            </span>
                                        </div>

                                    </div>
                                    <!-- /Carousel Item -->
                                </div>
                                <!-- /Slide -->


                                <!-- Slide -->
                                <div>
                                    <!-- Carousel Item -->
                                    <div class="product">

                                        <div class="product-image">
                                            <img src="resource/img/products/sample8.jpg" alt="Product1">
                                            <a href="products_page_v1.html" class="product-hover">
                                                <i class="icons icon-eye-1"></i> Quick View
                                            </a>
                                        </div>

                                        <div class="product-info">
                                            <h5><a href="products_page_v1.html">Lorem ipsum dolor sit amet</a></h5>
                                            <span class="price">$281.00</span>
                                            <div class="rating readonly-rating" data-score="4"></div>
                                        </div>

                                        <div class="product-actions">
                                            <span class="add-to-cart">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-basket-2"></i>
                                                    <span class="action-name">Add to cart</span>
                                                </span >
                                            </span>
                                            <span class="add-to-favorites">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-heart-empty"></i>
                                                    <span class="action-name">Add to wishlist</span>
                                                </span>
                                            </span>
                                            <span class="add-to-compare">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-docs"></i>
                                                    <span class="action-name">Add to Compare</span>
                                                </span>
                                            </span>
                                        </div>

                                    </div>
                                    <!-- /Carousel Item -->
                                </div>
                                <!-- /Slide -->



                                <!-- Slide -->
                                <div>
                                    <!-- Carousel Item -->
                                    <div class="product">

                                        <div class="product-image">
                                            <img src="resource/img/products/sample9.jpg" alt="Product1">
                                            <a href="products_page_v1.html" class="product-hover">
                                                <i class="icons icon-eye-1"></i> Quick View
                                            </a>
                                        </div>

                                        <div class="product-info">
                                            <h5><a href="products_page_v1.html">Lorem ipsum dolor sit amet</a></h5>
                                            <span class="price">$281.00</span>
                                            <div class="rating readonly-rating" data-score="4"></div>
                                        </div>

                                        <div class="product-actions">
                                            <span class="add-to-cart">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-basket-2"></i>
                                                    <span class="action-name">Add to cart</span>
                                                </span >
                                            </span>
                                            <span class="add-to-favorites">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-heart-empty"></i>
                                                    <span class="action-name">Add to wishlist</span>
                                                </span>
                                            </span>
                                            <span class="add-to-compare">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-docs"></i>
                                                    <span class="action-name">Add to Compare</span>
                                                </span>
                                            </span>
                                        </div>

                                    </div>
                                    <!-- /Carousel Item -->
                                </div>
                                <!-- /Slide -->




                                <!-- Slide -->
                                <div>
                                    <!-- Carousel Item -->
                                    <div class="product">

                                        <div class="product-image">
                                            <img src="resource/img/products/sample7.jpg" alt="Product1">
                                            <a href="products_page_v1.html" class="product-hover">
                                                <i class="icons icon-eye-1"></i> Quick View
                                            </a>
                                        </div>

                                        <div class="product-info">
                                            <h5><a href="products_page_v1.html">Lorem ipsum dolor sit amet</a></h5>
                                            <span class="price">$281.00</span>
                                            <div class="rating readonly-rating" data-score="4"></div>
                                        </div>

                                        <div class="product-actions">
                                            <span class="add-to-cart">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-basket-2"></i>
                                                    <span class="action-name">Add to cart</span>
                                                </span >
                                            </span>
                                            <span class="add-to-favorites">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-heart-empty"></i>
                                                    <span class="action-name">Add to wishlist</span>
                                                </span>
                                            </span>
                                            <span class="add-to-compare">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-docs"></i>
                                                    <span class="action-name">Add to Compare</span>
                                                </span>
                                            </span>
                                        </div>

                                    </div>
                                    <!-- /Carousel Item -->
                                </div>
                                <!-- /Slide -->




                                <!-- Slide -->
                                <div>
                                    <!-- Carousel Item -->
                                    <div class="product">

                                        <div class="product-image">
                                            <img src="resource/img/products/sample8.jpg" alt="Product1">
                                            <a href="products_page_v1.html" class="product-hover">
                                                <i class="icons icon-eye-1"></i> Quick View
                                            </a>
                                        </div>

                                        <div class="product-info">
                                            <h5><a href="products_page_v1.html">Lorem ipsum dolor sit amet</a></h5>
                                            <span class="price">$281.00</span>
                                            <div class="rating readonly-rating" data-score="4"></div>
                                        </div>

                                        <div class="product-actions">
                                            <span class="add-to-cart">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-basket-2"></i>
                                                    <span class="action-name">Add to cart</span>
                                                </span >
                                            </span>
                                            <span class="add-to-favorites">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-heart-empty"></i>
                                                    <span class="action-name">Add to wishlist</span>
                                                </span>
                                            </span>
                                            <span class="add-to-compare">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-docs"></i>
                                                    <span class="action-name">Add to Compare</span>
                                                </span>
                                            </span>
                                        </div>

                                    </div>
                                    <!-- /Carousel Item -->
                                </div>
                                <!-- /Slide -->





                                <!-- Slide -->
                                <div>
                                    <!-- Carousel Item -->
                                    <div class="product">

                                        <div class="product-image">
                                            <img src="resource/img/products/sample9.jpg" alt="Product1">
                                            <a href="products_page_v1.html" class="product-hover">
                                                <i class="icons icon-eye-1"></i> Quick View
                                            </a>
                                        </div>

                                        <div class="product-info">
                                            <h5><a href="products_page_v1.html">Lorem ipsum dolor sit amet</a></h5>
                                            <span class="price">$281.00</span>
                                            <div class="rating readonly-rating" data-score="4"></div>
                                        </div>

                                        <div class="product-actions">
                                            <span class="add-to-cart">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-basket-2"></i>
                                                    <span class="action-name">Add to cart</span>
                                                </span >
                                            </span>
                                            <span class="add-to-favorites">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-heart-empty"></i>
                                                    <span class="action-name">Add to wishlist</span>
                                                </span>
                                            </span>
                                            <span class="add-to-compare">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-docs"></i>
                                                    <span class="action-name">Add to Compare</span>
                                                </span>
                                            </span>
                                        </div>

                                    </div>
                                    <!-- /Carousel Item -->
                                </div>
                                <!-- /Slide -->


                            </div>
                        </div>
                        <!-- /Carousel -->

                    </div>
                    <!-- /Random Products -->




                    <!-- Product Brands -->
                    <div class="products-row row">

                        <!-- Carousel Heading -->
                        <div class="col-lg-12 col-md-12 col-sm-12">

                            <div class="carousel-heading">
                                <h4>Product Brands</h4>
                                <div class="carousel-arrows">
                                    <i class="icons icon-left-dir"></i>
                                    <i class="icons icon-right-dir"></i>
                                </div>
                            </div>

                        </div>
                        <!-- /Carousel Heading -->

                        <!-- Carousel -->
                        <div class="carousel owl-carousel-wrap col-lg-12 col-md-12 col-sm-12">

                            <div class="owl-carousel" data-max-items="5">

                                <!-- Slide -->
                                <div>
                                    <div class="product">
                                        <a href="#"><img src="resource/img/brands/sample.jpg" alt="Brand1"></a>
                                    </div>
                                </div>
                                <!-- /Slide -->

                                <!-- Slide -->
                                <div>
                                    <div class="product">
                                        <a href="#"><img src="resource/img/brands/sample.jpg" alt="Brand1"></a>
                                    </div>
                                </div>
                                <!-- /Slide -->

                                <!-- Slide -->
                                <div>
                                    <div class="product">
                                        <a href="#"><img src="img/brands/sample.jpg" alt="Brand1"></a>
                                    </div>
                                </div>
                                <!-- /Slide -->

                                <!-- Slide -->
                                <div>
                                    <div class="product">
                                        <a href="#"><img src="resource/img/brands/sample.jpg" alt="Brand1"></a>
                                    </div>
                                </div>
                                <!-- /Slide -->

                                <!-- Slide -->
                                <div>
                                    <div class="product">
                                        <a href="#"><img src="resource/img/brands/sample.jpg" alt="Brand1"></a>
                                    </div>
                                </div>
                                <!-- /Slide -->

                                <!-- Slide -->
                                <div>
                                    <div class="product">
                                        <a href="#"><img src="resource/img/brands/sample.jpg" alt="Brand1"></a>
                                    </div>
                                </div>
                                <!-- /Slide -->

                                <!-- Slide -->
                                <div>
                                    <div class="product">
                                        <a href="#"><img src="resource/img/brands/sample.jpg" alt="Brand1"></a>
                                    </div>
                                </div>
                                <!-- /Slide -->

                                <!-- Slide -->
                                <div>
                                    <div class="product">
                                        <a href="#"><img src="resource/img/brands/sample.jpg" alt="Brand1"></a>
                                    </div>
                                </div>
                                <!-- /Slide -->

                                <!-- Slide -->
                                <div>
                                    <div class="product">
                                        <a href="#"><img src="resource/img/brands/sample.jpg" alt="Brand1"></a>
                                    </div>
                                </div>
                                <!-- /Slide -->

                                <!-- Slide -->
                                <div>
                                    <div class="product">
                                        <a href="#"><img src="resource/img/brands/sample.jpg" alt="Brand1"></a>
                                    </div>
                                </div>
                                <!-- /Slide -->

                            </div>

                        </div>
                        <!-- /Carousel -->

                    </div>
                    <!-- /Product Brands -->


                </section>
                <!-- /Main Content -->




                <!-- Sidebar -->
                <aside class="sidebar col-lg-3 col-md-3 col-sm-3  col-lg-pull-9 col-md-pull-9 col-sm-pull-9">

                    <!-- Categories -->
                    <div class="row sidebar-box purple">

                        <div class="col-lg-12 col-md-12 col-sm-12">

                            <div class="sidebar-box-heading">
                                <i class="icons icon-folder-open-empty"></i>
                                <h4>Categories</h4>
                            </div>

                            <div class="sidebar-box-content">
                                <ul>
                                    <li><a href="#">Cameras &amp; Photography <i class="icons icon-right-dir"></i></a></li>
                                    <li><a href="#">Computers &amp; Tablets <i class="icons icon-right-dir"></i></a></li>
                                    <li><a href="#">Cell Phones &amp; Accessories <i class="icons icon-right-dir"></i></a>
                                        <ul class="sidebar-dropdown">
                                            <li>
                                                <ul>
                                                    <li><a href="#">Cell phones &amp; Smartphone</a></li>
                                                    <li><a href="#">Cell Phone Accessories</a></li>
                                                    <li><a href="#">Headsets</a></li>
                                                    <li><a href="#">Cases, Covers & Skins</a></li>
                                                    <li><a href="#">Screen Protectors</a></li>
                                                </ul>
                                            </li>
                                            <li>
                                                <ul>
                                                    <li><a href="#">Chargers & Cradles</a></li>
                                                    <li><a href="#">Batteries</a></li>
                                                    <li><a href="#">Cables & Adapters</a></li>
                                                    <li><a href="#">All About Smartphones</a></li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </li>
                                    <li><a href="#">TV, Audio &amp; Surveillance <i class="icons icon-right-dir"></i></a></li>
                                    <li><a href="#">Video Games &amp; Consoles <i class="icons icon-right-dir"></i></a></li>
                                    <li><a href="#">Car Audio, Video &amp; GPS <i class="icons icon-right-dir"></i></a></li>
                                    <li><a href="#">Best Sellers <i class="icons icon-right-dir"></i></a></li>
                                    <li><a href="#">Shop by Brands <i class="icons icon-right-dir"></i></a></li>
                                    <li><a class="purple" href="#">All Categories</a></li>
                                </ul>
                            </div>

                        </div>

                    </div>
                    <!-- /Categories -->


                    <!-- Compare Products -->
                    <div class="row sidebar-box blue">

                        <div class="col-lg-12 col-md-12 col-sm-12">

                            <div class="sidebar-box-heading">
                                <i class="icons icon-docs"></i>
                                <h4>Compare Products</h4>
                            </div>

                            <div class="sidebar-box-content sidebar-padding-box">
                                <p>You have no products to compare.</p>
                            </div>

                        </div>

                    </div>
                    <!-- /Compare Products -->


                    <!-- Carousel -->
                    <div class="row sidebar-box">

                        <div class="col-lg-12 col-md-12 col-sm-12 sidebar-carousel">

                            <!-- Slider -->
                            <section class="sidebar-slider">
                                <div class="sidebar-flexslider">
                                    <ul class="slides">
                                        <li>
                                            <a href="#"><img src="resource/resource/img/sidebar-slide1.jpg" alt="Slide1"/></a>
                                        </li>
                                        <li>
                                            <a href="#"><img src="resource/img/sidebar-slide2.jpg" alt="Slide1"/></a>
                                        </li>
                                        <li>
                                            <a href="#"><img src="resource/img/sidebar-slide3.jpg" alt="Slide1"/></a>
                                        </li>
                                    </ul>
                                </div>
                                <div class="slider-nav"></div>
                            </section>
                            <!-- /Slider -->

                        </div>

                    </div>
                    <!-- /Carousel -->


                    <!-- Bestsellers -->
                    <div class="row sidebar-box red">

                        <div class="col-lg-12 col-md-12 col-sm-12">

                            <div class="sidebar-box-heading">
                                <i class="icons icon-award-2"></i>
                                <h4>Bestsellers</h4>
                            </div>

                            <div class="sidebar-box-content">
                                <table class="bestsellers-table">

                                    <tr>
                                        <td class="product-thumbnail"><a href="#"><img src="resource/img/products/sample1.jpg" alt="Product1"></a></td>
                                        <td class="product-info">
                                            <p><a href="#">Lorem ipsum dolor sit amet</a></p>
                                            <span class="price">$550.00</span>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td class="product-thumbnail"><a href="#"><img src="resource/img/products/sample2.jpg" alt="Product1"></a></td>
                                        <td class="product-info">
                                            <p><a href="#">Lorem ipsum dolor sit amet</a></p>
                                            <span class="price">$550.00</span>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td class="product-thumbnail"><a href="#"><img src="resource/img/products/sample3.jpg" alt="Product1"></a></td>
                                        <td class="product-info">
                                            <p><a href="#">Lorem ipsum dolor sit amet</a></p>
                                            <div class="rating readonly-rating" data-score="4"></div>
                                            <span class="price"><del>$650.00</del> $550.00</span>
                                        </td>
                                    </tr>

                                </table>
                            </div>

                        </div>

                    </div>
                    <!-- /Bestsellers -->


                    <!-- Tag Cloud -->
                    <div class="row sidebar-box green">

                        <div class="col-lg-12 col-md-12 col-sm-12">

                            <div class="sidebar-box-heading">
                                <i class="icons icon-tag-6"></i>
                                <h4>Tags Cloud</h4>
                            </div>

                            <div class="sidebar-box-content sidebar-padding-box">
                                <a href="#" class="tag-item">digital camera</a>
                                <a href="#" class="tag-item">lorem</a>
                                <a href="#" class="tag-item">gps</a>
                                <a href="#" class="tag-item">headphones</a>
                                <a href="#" class="tag-item">ipsum</a>
                                <a href="#" class="tag-item">laptop</a>
                                <a href="#" class="tag-item">smartphone</a>
                                <a href="#" class="tag-item">tv</a>
                            </div>

                        </div>

                    </div>
                    <!-- /Tag Cloud -->


                    <!-- Specials -->
                    <div class="row products-row sidebar-box orange">

                        <div class="col-lg-12 col-md-12 col-sm-12">

                            <!-- Carousel Heading -->
                            <div class="carousel-heading no-margin">

                                <h4><i class="icons icon-magic"></i> Specials</h4>
                                <div class="carousel-arrows">
                                    <i class="icons icon-left-dir"></i>
                                    <i class="icons icon-right-dir"></i>
                                </div>

                            </div>
                            <!-- /Carousel Heading -->

                        </div>

                        <!-- Carousel -->
                        <div class="carousel owl-carousel-wrap col-lg-12 col-md-12 col-sm-12">

                            <div class="owl-carousel" data-max-items="1">

                                <!-- Slide -->
                                <div>
                                    <!-- Carousel Item -->
                                    <div class="product">

                                        <div class="product-image">
                                            <img src="resource/img/products/sample1.jpg" alt="Product1">
                                            <a href="products_page_v1.html" class="product-hover">
                                                <i class="icons icon-eye-1"></i> Quick View
                                            </a>
                                        </div>

                                        <div class="product-info">
                                            <h5><a href="products_page_v1.html">Lorem ipsum dolor sit amet</a></h5>
                                            <span class="price">$281.00</span>
                                            <div class="rating readonly-rating" data-score="4"></div>
                                        </div>

                                        <div class="product-actions">
                                            <span class="add-to-cart">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-basket-2"></i>
                                                    <span class="action-name">Add to cart</span>
                                                </span >
                                            </span>
                                            <span class="add-to-favorites">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-heart-empty"></i>
                                                    <span class="action-name">Add to wishlist</span>
                                                </span>
                                            </span>
                                            <span class="add-to-compare">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-docs"></i>
                                                    <span class="action-name">Add to Compare</span>
                                                </span>
                                            </span>
                                        </div>

                                    </div>
                                    <!-- /Carousel Item -->
                                </div>
                                <!-- /Slide -->


                                <!-- Slide -->
                                <div>
                                    <!-- Carousel Item -->
                                    <div class="product">

                                        <div class="product-image">
                                            <img src="resource/img/products/sample2.jpg" alt="Product1">
                                            <a href="products_page_v1.html" class="product-hover">
                                                <i class="icons icon-eye-1"></i> Quick View
                                            </a>
                                        </div>

                                        <div class="product-info">
                                            <h5><a href="products_page_v1.html">Lorem ipsum dolor sit amet</a></h5>
                                            <span class="price">$281.00</span>
                                            <div class="rating readonly-rating" data-score="4"></div>
                                        </div>

                                        <div class="product-actions">
                                            <span class="add-to-cart">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-basket-2"></i>
                                                    <span class="action-name">Add to cart</span>
                                                </span >
                                            </span>
                                            <span class="add-to-favorites">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-heart-empty"></i>
                                                    <span class="action-name">Add to wishlist</span>
                                                </span>
                                            </span>
                                            <span class="add-to-compare">
                                                <span class="action-wrapper">
                                                    <i class="icons icon-docs"></i>
                                                    <span class="action-name">Add to Compare</span>
                                                </span>
                                            </span>
                                        </div>

                                    </div>
                                    <!-- /Carousel Item -->
                                </div>
                                <!-- /Slide -->

                            </div>

                        </div>
                        <!-- / Carousel -->


                    </div>
                    <!-- /Specials -->


                </aside>
                <!-- /Sidebar -->

            </div>
            <!-- /Content -->





            <!-- News -->
            <div class="products-row row">

                <!-- Carousel Heading -->
                <div class="col-lg-12 col-md-12 col-sm-12">

                    <div class="carousel-heading">
                        <h4>Latest news &amp; Reviews</h4>
                        <div class="carousel-arrows">
                            <i class="icons icon-left-dir"></i>
                            <i class="icons icon-right-dir"></i>
                        </div>
                    </div>

                </div>
                <!-- /Carousel Heading -->


                <!-- Carousel -->
                <div class="carousel owl-carousel-wrap col-lg-12 col-md-12 col-sm-12">

                    <div class="owl-carousel" data-max-items="2">

                        <!-- Slide -->
                        <div>
                            <!-- Carousel Item -->
                            <article class="news">

                                <div class="news-background">

                                    <div class="row">
                                        <div class="col-lg-6 col-md-6 col-sm-6 news-thumbnail">
                                            <a href="#"><img src="resource/img/news/sample1.jpg" alt="News1"></a>
                                        </div>
                                        <div class="col-lg-6 col-md-6 col-sm-6 news-content">
                                            <h5><a href="blog_post.html">Lorem Ipsum</a></h5>
                                            <span class="date"><i class="icons icon-clock-1"></i> 23 April, 2012</span>
                                            <p>Duis ac turpis. Integer rutrum ante eu lacus. Vestibulum libero nisl, porta vel, scelerisque eget, malesuada at, neque. Vivamus eget nibh.</p>
                                        </div>
                                    </div>

                                </div>

                            </article>
                            <!-- /Carousel Item -->
                        </div>
                        <!-- /Slide -->


                        <!-- Slide -->
                        <div>

                            <!-- Carousel Item -->
                            <article class="news">

                                <div class="news-background">

                                    <div class="row">
                                        <div class="col-lg-6 col-md-6 col-sm-6 news-thumbnail">
                                            <a href="#"><img src="resource/img/news/sample2.jpg" alt="News1"></a>
                                        </div>
                                        <div class="col-lg-6 col-md-6 col-sm-6 news-content">
                                            <h5><a href="blog_post.html">Lorem Ipsum</a></h5>
                                            <span class="date"><i class="icons icon-clock-1"></i> 23 April, 2012</span>
                                            <p>Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae. Suspendisse sollicitudin.</p>
                                        </div>
                                    </div>

                                </div>

                            </article>
                            <!-- /Carousel Item -->

                        </div>
                        <!-- /Slide -->



                        <!-- Slide -->
                        <div>

                            <!-- Carousel Item -->
                            <article class="news">

                                <div class="news-background">

                                    <div class="row">
                                        <div class="col-lg-6 col-md-6 col-sm-6 news-thumbnail">
                                            <a href="#"><img src="resource/img/news/sample2.jpg" alt="News1"></a>
                                        </div>
                                        <div class="col-lg-6 col-md-6 col-sm-6 news-content">
                                            <h5><a href="blog_post.html">Lorem Ipsum</a></h5>
                                            <span class="date"><i class="icons icon-clock-1"></i> 23 April, 2012</span>
                                            <p>Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae. Suspendisse sollicitudin.</p>
                                        </div>
                                    </div>

                                </div>

                            </article>
                            <!-- /Carousel Item -->

                        </div>
                        <!-- /Slide -->




                        <!-- Slide -->
                        <div>

                            <!-- Carousel Item -->
                            <article class="news">

                                <div class="news-background">

                                    <div class="row">
                                        <div class="col-lg-6 col-md-6 col-sm-6 news-thumbnail">
                                            <a href="#"><img src="resource/img/news/sample2.jpg" alt="News1"></a>
                                        </div>
                                        <div class="col-lg-6 col-md-6 col-sm-6 news-content">
                                            <h5><a href="blog_post.html">Lorem Ipsum</a></h5>
                                            <span class="date"><i class="icons icon-clock-1"></i> 23 April, 2012</span>
                                            <p>Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae. Suspendisse sollicitudin.</p>
                                        </div>
                                    </div>

                                </div>

                            </article>
                            <!-- /Carousel Item -->

                        </div>
                        <!-- /Slide -->




                        <!-- Slide -->
                        <div>

                            <!-- Carousel Item -->
                            <article class="news">

                                <div class="news-background">

                                    <div class="row">
                                        <div class="col-lg-6 col-md-6 col-sm-6 news-thumbnail">
                                            <a href="#"><img src="resource/img/news/sample2.jpg" alt="News1"></a>
                                        </div>
                                        <div class="col-lg-6 col-md-6 col-sm-6 news-content">
                                            <h5><a href="blog_post.html">Lorem Ipsum</a></h5>
                                            <span class="date"><i class="icons icon-clock-1"></i> 23 April, 2012</span>
                                            <p>Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae. Suspendisse sollicitudin.</p>
                                        </div>
                                    </div>

                                </div>

                            </article>
                            <!-- /Carousel Item -->

                        </div>
                        <!-- /Slide -->


                    </div>

                </div>
                <!-- /Carousel -->

            </div>
            <!-- /News -->



            <!-- Banner -->
            <section class="banner">

                <div class="left-side-banner banner-item icon-on-right gray">
                    <h4>8(802)234-5678</h4>
                    <p>Monday - Saturday: 8am - 5pm PST</p>
                    <i class="icons icon-phone-outline"></i>
                </div>

                <a href="#">
                    <div class="middle-banner banner-item icon-on-left light-blue">
                        <h4>Free shipping</h4>
                        <p>on all orders over $99</p>
                        <span class="button">Learn more</span>
                        <i class="icons icon-truck-1"></i>
                    </div>
                </a>

                <a href="#">
                    <div class="right-side-banner banner-item orange">
                        <h4>Crazy sale!</h4>
                        <p>on selected items</p>
                        <span class="button">Shop now</span>
                    </div>
                </a>

            </section>
            <!-- /Banner -->


            <!-- Footer -->
            <footer id="footer" class="row">

                <!-- Upper Footer -->
                <div class="col-lg-12 col-md-12 col-sm-12">

                    <div id="upper-footer">

                        <div class="row">

                            <!-- Newsletter -->
                            <div class="col-lg-7 col-md-7 col-sm-7">
                                <form id="newsletter" action="resource/php/newsletter.php">
                                    <h4>Newsletter Sign Up</h4>
                                    <input type="text" name="newsletter-email" placeholder="Enter your email address">
                                    <input type="submit" name="newsletter-submit" value="Submit">
                                </form>
                            </div>
                            <!-- /Newsletter -->


                            <!-- Social Media -->
                            <div class="col-lg-5 col-md-5 col-sm-5 social-media">
                                <h4>Stay Connected</h4>
                                <ul>
                                    <li class="social-googleplus tooltip-hover" data-toggle="tooltip" data-placement="top" title="Google+"><a href="#"></a></li>
                                    <li class="social-facebook tooltip-hover" data-toggle="tooltip" data-placement="top" title="Facebook"><a href="#"></a></li>
                                    <li class="social-pinterest tooltip-hover" data-toggle="tooltip" data-placement="top" title="Pinterest"><a href="#"></a></li>
                                    <li class="social-twitter tooltip-hover" data-toggle="tooltip" data-placement="top" title="Twitter"><a href="#"></a></li>
                                    <li class="social-youtube tooltip-hover" data-toggle="tooltip" data-placement="top" title="Youtube"><a href="#"></a></li>
                                </ul>
                            </div>
                            <!-- /Social Media -->

                        </div>

                    </div>

                </div>
                <!-- /Upper Footer -->



                <!-- Main Footer -->
                <div class="col-lg-12 col-md-12 col-sm-12">

                    <div id="main-footer">

                        <div class="row">

                            <!-- The Service -->
                            <div class="col-lg-3 col-md-3 col-sm-6">
                                <h4>The Service</h4>
                                <ul>
                                    <li><a href="#"><i class="icons icon-right-dir"></i> My account</a></li>
                                    <li><a href="#"><i class="icons icon-right-dir"></i> Order history</a></li>
                                    <li><a href="#"><i class="icons icon-right-dir"></i> Vendor contact</a></li>
                                    <li><a href="#"><i class="icons icon-right-dir"></i> Shop page</a></li>
                                    <li><a href="#"><i class="icons icon-right-dir"></i> Categories</a></li>
                                    <li><a href="#"><i class="icons icon-right-dir"></i> Search results</a></li>
                                </ul>
                            </div>
                            <!-- /The Service -->


                            <!-- Like us on Facebook -->
                            <div class="col-lg-3 col-md-3 col-sm-6 facebook-iframe">
                                <h4>Like us on Facebook</h4>
                                <iframe src="//www.facebook.com/plugins/likebox.php?href=http%3A%2F%2Fwww.facebook.com%2FFacebookDevelopers&amp;width=270&amp;height=250&amp;colorscheme=light&amp;header=false&amp;show_faces=true&amp;stream=false&amp;show_border=false" style="border:none; overflow:hidden; width:100%; height:290px;"></iframe>
                            </div>
                            <!-- /Like us on Facebook -->


                            <!-- Information -->
                            <div class="col-lg-3 col-md-3 col-sm-6">
                                <h4>Information</h4>
                                <ul>
                                    <li><a href="#"><i class="icons icon-right-dir"></i> About Us</a></li>
                                    <li><a href="#"><i class="icons icon-right-dir"></i> New Collection</a></li>
                                    <li><a href="#"><i class="icons icon-right-dir"></i> Bestsellers</a></li>
                                    <li><a href="#"><i class="icons icon-right-dir"></i> Manufacturers</a></li>
                                    <li><a href="#"><i class="icons icon-right-dir"></i> Privacy Policy</a></li>
                                    <li><a href="#"><i class="icons icon-right-dir"></i> Terms &amp; Conditions</a></li>
                                </ul>
                            </div>
                            <!-- /Information -->


                            <!-- Contact Us -->
                            <div class="col-lg-3 col-md-3 col-sm-6 contact-footer-info">
                                <h4>Contact Us</h4>
                                <ul>
                                    <li><i class="icons icon-location"></i> 8901 Marmora Road,<br>Glasgow, D04 89GR.</li>
                                    <li><i class="icons icon-phone"></i> +1 800 603 6035</li>
                                    <li><i class="icons icon-mail-alt"></i><a href="mailto:mail@company.com"> mail@companyname.com</a></li>
                                    <li><i class="icons icon-skype"></i> homeshop</li>
                                </ul>
                            </div>
                            <!-- /Contact Us -->

                        </div>

                    </div>

                </div>
                <!-- /Main Footer -->



                <!-- Lower Footer -->
                <div class="col-lg-12 col-md-12 col-sm-12">

                    <div id="lower-footer">

                        <div class="row">

                            <div class="col-lg-6 col-md-6 col-sm-6">
                                <p class="copyright">Copyright 2014 <a href="#">HomeShop</a>. All Rights Reserved.</p>
                            </div>

                            <div class="col-lg-6 col-md-6 col-sm-6">
                                <ul class="payment-list">
                                    <li class="payment1"></li>
                                    <li class="payment2"></li>
                                    <li class="payment3"></li>
                                    <li class="payment4"></li>
                                    <li class="payment5"></li>
                                </ul>
                            </div>

                        </div>

                    </div>

                </div>
                <!-- /Lower Footer -->

            </footer>
            <!-- Footer -->


            <div id="back-to-top">
                <i class="icon-up-dir"></i>
            </div>

        </div>
        <!-- Container -->



        <!-- JavaScript -->
        <script src="resource/js/modernizr.min.js"></script>
        <script src="resource/js/jquery-1.11.0.min.js"></script>
        <script type="text/javascript" src="resource/js/jquery-ui.min.js"></script>
        <script type="text/javascript" src="resource/js/jquery.raty.min.js"></script>

        <!-- Scroll Bar -->
        <script src="resource/js/perfect-scrollbar.min.js"></script>

        <!-- Cloud Zoom -->
        <script src="resource/js/zoomsl-3.0.min.js"></script>

        <!-- FancyBox -->
        <script src="resource/js/jquery.fancybox.pack.js"></script>

        <!-- jQuery REVOLUTION Slider  -->
        <script type="text/javascript" src="resource/js/jquery.themepunch.plugins.min.js"></script>
        <script type="text/javascript" src="resource/js/jquery.themepunch.revolution.min.js"></script>

        <!-- FlexSlider -->
        <script defer src="resource/js/flexslider.min.js"></script>

        <!-- IOS Slider -->
        <script src = "resource/js/jquery.iosslider.min.js"></script>

        <!-- noUi Slider -->
        <script src="resource/js/jquery.nouislider.min.js"></script>

        <!-- Owl Carousel -->
        <script src="resource/js/owl.carousel.min.js"></script>

        <!-- Cloud Zoom -->
        <script src="resource/js/zoomsl-3.0.min.js"></script>

        <!-- SelectJS -->
        <script src="resource/js/chosen.jquery.min.js" type="text/javascript"></script>

        <!-- Main JS -->
        <script defer src="resource/js/bootstrap.min.js"></script>
        <script src="resource/js/main-script.js"></script>



    </body>

</html>
