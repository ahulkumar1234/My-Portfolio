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
