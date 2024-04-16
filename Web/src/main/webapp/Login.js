// 获取DOM元素
const signInBtn = document.getElementById("signIn");
const signUpBtn = document.getElementById("signUp");
const fistForm = document.getElementById("form1");
const secondForm = document.getElementById("form2");
const container = document.querySelector(".container");

// 点击事件的监听
signInBtn.addEventListener("click", () => {
	container.classList.remove("right-panel-active");
});


signUpBtn.addEventListener("click", () => {
	container.classList.add("right-panel-active");
});

// // 提交事件的监听
// // 这是AI叫我加上去的，防止表单的默认提交行为
// // 就是页面不会因为表单提交而刷新。
// fistForm.addEventListener("submit", (e) => e.preventDefault());
// secondForm.addEventListener("submit", (e) => e.preventDefault());



// // 判断注册时密码的输入规范
// document.getElementById("btn1").addEventListener("click", function(e) {
//     const usernameInput = document.getElementById("form1").querySelector('input[type="text"]');
//     const emailInput = document.getElementById("form1").querySelector('input[type="email"]');
//     const passwordInput = document.getElementById("form1").querySelector('input[type="password"]');
//     const username = usernameInput.value;
//     const email = emailInput.value;
//     const password = passwordInput.value;
    
//     if (username.trim() === "") {
//         alert("用户名不能为空！");
//         e.preventDefault();
//         return; 
//     }

//     const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
//     if (!emailPattern.test(email)) {
//         alert("请输入正确的邮箱格式！");
//         e.preventDefault();
//         return; 
//     }
//     const hasUpperCase = /[A-Z]/.test(password);
//     const hasLowerCase = /[a-z]/.test(password);
//     const hasNumber = /[0-9]/.test(password);
//     const isLengthValid = password.length >= 8;
//     if (!isLengthValid || !(hasUpperCase && hasLowerCase && hasNumber)) {
//         alert("密码必须至少包含8个字符，并且必须包含字母大小写和数字！");
//         e.preventDefault();
//     } else {
//         alert("注册成功！");
//     }
// });


// 手动点击：document.getElementById("signUp").click();


// 登录账户检测
// console.log("登录按钮点击事件绑定前");

// document.getElementById("btn2").addEventListener("click", function(e) {
//     console.log("登录按钮点击事件触发");
//     const usernameInput = document.getElementById("form2").querySelector('input[type="email"]');
//     const passwordInput = document.getElementById("form2").querySelector('input[type="password"]');
//     const username = usernameInput.value;
//     const password = passwordInput.value;
//     if (username.trim() === "") {
//         alert("用户名不能为空！");
//         e.preventDefault();
//         return; 
//     }
//     if (password.trim() === "") {
//         alert("密码不能为空！");
//         e.preventDefault();
//         return; 
//     }
//     alert("登录成功！");
// });
