$(document).ready(function () {


    $("#login").on('click',function(event){

        loginRequest();

       
    });

    $("#register").on('click',function(event){

        registerRequest();

       
    });

   

    function loginRequest(){

        $.ajax({
            url: "user/auth-user",
            method:'POST',
            data:JSON.stringify({email:$("#emailId").val(),password:$("#password").val()}),
            contentType:'application/json',
            success: function(result){
                window.location = "home";
            },
            error: function(xhr,status,error){
                $(".message-wrapper").html(xhr.responseText);
                $(".message-wrapper").show();
            }
        });
    

    };

    function  registerRequest(){

        $.ajax({
            url: "user/register-user",
            method:'POST',
            data:JSON.stringify({firstname:$("#firstname").val(),lastname:$("#lastname").val(),mobileNumber:$("#mobileNo").val(),email:$("#emailId").val(),password:$("#password").val()}),
            contentType:'application/json',
            success: function(result){
                window.location = "home";
            },
            error: function(xhr,status,error){
                $(".message-wrapper").html(xhr.responseText);
                $(".message-wrapper").show();
            }
        });

    }


    
});