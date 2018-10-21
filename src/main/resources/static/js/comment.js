$(document).ready(function () {

    var base_comment = $("#base_comment");
    getComment();


   function getComment(){

        $.ajax({
            url: "comment/all",
            method:'GET',
            dataType: 'JSON',
            contentType:'application/json',
            success: function(result){
                appendComment(result);
            },
            error: function(xhr,status,error){
                console.log(xhr);
            }
        });
    
    }

    function appendComment(comments){

        for(var i = 0 ; i < comments.length ; i++){
                var commentElement = $("#base_comment").clone();
                $(commentElement).attr("id",comments[i].id + "_commentId");
                $(commentElement).find("p").text(comments[i].comment);
                $(".commentList").append(commentElement);
                $(commentElement).show();
        }

    }


});