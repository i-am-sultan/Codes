const loginForm = document.querySelector('form');
const usernameInput = document.querySelector('#username');
const passwordInput = document.querySelector('#password');
const errorMessage = document.querySelector('#error-message');

loginForm.addEventListener('submit', (event) => {
  event.preventDefault();
  const username = usernameInput.value;
  const password = passwordInput.value;
  if (username === 'admin' && password === 'password') {
    window.location.href = 'dashboard.html';
  } else {
    errorMessage.textContent = 'Invalid username or password';
  }
});
