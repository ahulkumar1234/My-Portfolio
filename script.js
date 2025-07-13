


AOS.init({
  duration: 1000,      // Animation duration in ms
  once: true,          // Animate only once while scrolling
  offset: 120,         // Offset (in px) from the original trigger point
});



const form = document.getElementById("contact-form");

form.addEventListener("submit", function (e) {
  e.preventDefault(); // stop default form action

  const formData = new FormData(form);

  fetch("https://formsubmit.co/rahulkumar8340527941@gmail.com", {
    method: "POST",
    body: formData
  })
    .then(response => {
      if (response.ok) {
        alert("✅ Message sent successfully!");
        form.reset();
      } else {
        alert("❌ Failed to send message.");
      }
    })
    .catch(error => {
      alert("⚠️ Error occurred. Try again later.");
    });
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