


AOS.init({
  duration: 1000,      // Animation duration in ms
  once: true,          // Animate only once while scrolling
  offset: 120,         // Offset (in px) from the original trigger point
});



// const form = document.getElementById("contact-form");

// form.addEventListener("submit", function (e) {
//   e.preventDefault(); // stop default form action

//   const formData = new FormData(form);

//   fetch("https://formsubmit.co/rahulkumar8340527941@gmail.com", {
//     method: "POST",
//     body: formData
//   })
//     .then(response => {
//       if (response.ok) {
//         alert("✅ Message sent successfully!");
//         form.reset();
//       } else {
//         alert("❌ Failed to send message.");
//       }
//     })
//     .catch(error => {
//       alert("⚠️ Error occurred. Try again later.");
//     });
// });

let form = document.querySelector("form");
let email = document.querySelector("#email");
let message = document.querySelector("#message");

form.addEventListener("submit", function (dets) {
  dets.preventDefault();

  document.querySelector("#emailerror").textContent = ""
  document.querySelector("#textmsg").textContent = ""


  let emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/
  let messageRegex = /^[a-zA-Z0-9\s.,!?'"()\-]{10,500}$/

  let emailans = emailRegex.test(email.value);
  let messageans = messageRegex.test(message.value);

  let isvalid = true

  if (!emailans) {
    document.querySelector("#emailerror").textContent = "Email is incorrect"
    emailerror.style.color = "red"
    isvalid = false
  }
  if (!messageans) {
    document.querySelector("#textmsg").textContent = "Write somthing"
    textmsg.style.color = "red";
    isvalid = false
  }

  if (isvalid) {
    document.querySelector("#successmessage").textContent = "Thank you message sent successfully!"
  }
});



let mode = document.querySelector(".modebtn");

mode.addEventListener("click", function () {
  document.querySelector("body").classList.toggle("darkmode");
  document.querySelector(".mainitems").classList.toggle("maindark")
  document.querySelector(".aboutitems").classList.toggle("aboutdark")
  document.querySelector(".contactitem").classList.toggle("contactdark")
});


let dot = document.querySelector(".dot");
let scndot = document.querySelector(".scndot");

window.addEventListener("mousemove", function (dets) {
  dot.style.top = dets.clientY + "px"
  dot.style.left = dets.clientX + "px"

  scndot.style.top = dets.clientY + "px"
  scndot.style.left = dets.clientX + "px"
});
