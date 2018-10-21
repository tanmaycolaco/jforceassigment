<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
        crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
        crossorigin="anonymous">
    <link rel="stylesheet" href="./css/simple-sidebar.css">
    <link rel="stylesheet" href="./css/home.css">
    <title>Home</title>
</head>

<body>

    <div class="container">

        <div class="row">

            <div id="wrapper" class="toggled">

                <!-- Sidebar -->
                <div id="sidebar-wrapper">
                    <ul class="sidebar-nav">
                        <li class="sidebar-brand">
                            <a href="#">
                                Comment Box
                            </a>
                        </li>
                        <li>
                            <a href="#">Home</a>
                        </li>
                        <li>
                            <a href="#">Profile</a>
                        </li>
                        <li>
                            <a href="#">Log Out</a>
                        </li>
                    </ul>
                </div>
                <!-- /#sidebar-wrapper -->

                <!-- Page Content -->
                <div id="page-content-wrapper">
                    <div class="container-fluid">
                        <div class="detailBox">
                            <div class="titleBox">
                                <label>Comment Box</label>
                                <button type="button" class="close" aria-hidden="true">&times;</button>
                            </div>
                            <div class="commentBox">

                                <p class="taskDescription">Lorem Ipsum is simply dummy text of the printing and
                                    typesetting industry.</p>
                            </div>
                            <div class="actionBox">
                                <ul class="commentList">
                                    <li id="base_comment" style="display:none">
                                        <div class="commenterImage">
                                            <img src="" />
                                        </div>
                                        <div class="commentText">
                                            <p class="">Hello this is a test comment.</p> <span class="date sub-text">on
                                                March 5th, 2014</span>

                                        </div>
                                    </li>

                                </ul>
                                <form class="form-inline" role="form">
                                    <div class="form-group">
                                        <input class="form-control" type="text" placeholder="Your comments" />
                                    </div>
                                    <button class=" btn btn-default msg_send_btn" type="button"><span class="glyphicon glyphicon-send" aria-hidden="true"></span></button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- /#page-content-wrapper -->

            </div>

        </div>

    </div>

    <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
        crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
        crossorigin="anonymous"></script>
        <script src="/js/comment.js" ></script>
</body>

</html>