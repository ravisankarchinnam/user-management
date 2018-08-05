<jsp:include page="copyright.jsp"/>

<script>
    function saveData(id) {
        console.log('save Data -  ' + id)
        var fname = $('#text_fname_' + id).val();
        var lname = $('#text_lname_' + id).val();
        if (fname == "") {
            $('#text_fname_' + id).css('border-color', 'red');
            return;
        }
        if (lname == "") {
            $('#text_lname_' + id).css('border-color', 'red');
            return;
        }
        $.ajax({
            type: "POST",
            url: "/save",
            contentType: "application/json",
            dataType: "json",
            data: JSON.stringify({
                id: id,
                firstName: fname,
                lastName: lname
            }),
            success: function (data, textStatus, xhr) {
                console.log("success  ---> ");
                window.location = "/";

            },
            error: function (data, xhr, textStatus) {
                console.log("failure ---> ");
                console.log(JSON.stringify(xhr));
            }
        });

    }

    function hideContent() {
        $('#loadingDiv').show();
        $('#contentDiv').hide();
    }

    function showContent() {
        $('#loadingDiv').hide();
        $('#contentDiv').show();
    }
</script>
<jsp:include page="footer.jsp"/>
<script src="resources/js/edit.js"></script>