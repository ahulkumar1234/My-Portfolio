let mode = document.querySelector(".modebtn");
let body = document.querySelector("body");

mode.addEventListener("click", () => {
  body.classList.toggle("dark-mode");
});


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

