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
    <link rel="stylesheet" href="./css/main.css">
    <title>Register</title>
</head>

<body>

    <div class="container">

        <div class="row">

            <div class="col-md-12">

                <div class=" col-md-offset-4 col-md-4 form-box-wrapper register">

                    <div class="logo-wrapper"></div>

                    <div class="message-wrapper" style="display:none"></div>

                    <div class="form-input-wrapper">
                        <form id="register-form"  >
                            <div class="form-group">
                                <label for="firsname">First Name</label>
                                <input type="text" class="form-control input-text-box" id="firstname">
                            </div>
                            <div class="form-group">
                                <label for="lastname">Last Name</label>
                                <input type="text" class="form-control input-text-box" id="lastname">
                            </div>
                            <div class="form-group">
                                <label for="emailId">Email address</label>
                                <input type="email" class="form-control input-text-box" id="emailId">
                            </div>
                            <div class="form-group">
                                <label for="password">Password</label>
                                <input type="password" class="form-control input-text-box" id="password">
                            </div>
                            <div class="form-group">
                                <label for="mobileNo">Mobile Number</label>
                                <input type="text" class="form-control input-text-box" id="mobileNo">
                            </div>
                            <button type="button" class="btn btn-success pull-right" id="register">Register</button>
                        </form>
                        <div class="menu-wrapper"><a href="#" class="menu-text">Forgot Password</a>|<a href="#" class="menu-text">Sign In</a></div>
                    </div>

                </div>

            </div>

        </div>

    </div>

    <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
        crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
        crossorigin="anonymous"></script>
        <script src="/js/login-register.js" ></script>
</body>

</html>