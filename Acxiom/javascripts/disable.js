const disableForm = document.querySelector('form');
const reminderIdInput = document.querySelector('#reminder-id');
const errorMessage = document.querySelector('#error-message');

disableForm.addEventListener('submit', (event) => {
  event.preventDefault();
  const reminderId = reminderIdInput.value;
  // TODO: Send request to backend to disable reminder with given ID
  // If the request is successful, redirect to a success page
  // If the request fails, display an error message
});
