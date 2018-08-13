// $(document).ready(function () {
//     $("#login_btn").bind("click", getUserInfo);
// });
//
// function getUserInfo() {
//     var user_id = $("#user_id").val();
//     if (user_id == "") {
//         alert("用户名为空， 请填写完整！");
//     } else {
//         var user_login_info = {};
//         user_login_info.user_id = $("#user_id").val();
//         var data = JSON.stringify(user_login_info);
//         logIn(data);
//     }
// }
//
// function logIn(data) {
//     $.post('http://localhost:8888', data, function (res) {
//         console.log(res);
//     });
// }