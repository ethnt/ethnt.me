if ('serviceWorker' in navigator) {
  navigator.serviceWorker.register('/service-worker.js').then(function () {
    console.log('ServiceWorker registered successfully');
  }).catch(function (err) {
    console.log('Service worker registration failed: ', err);
  });
}
