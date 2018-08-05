$(function () {
    $('.updateData').click(function () {
        console.log('updateData')
        var id = $(this).attr('id').substring(7);
        $('#fname_' + id).hide();
        $('#text_fname_' + id).show();
        $('#text_fname_' + id).focus();
        $('#lname_' + id).hide();
        $('#text_lname_' + id).show();
        $(this).hide();
        $('#save_' + id).show();

    });

});