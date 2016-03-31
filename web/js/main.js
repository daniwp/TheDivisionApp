
$(document).ready(function () {
    window.setTimeout(function () {
        $(".alertMessage").fadeTo(500, 0).slideUp(500, function () {
            $(this).remove();
        });
    }, 5000);   
});


