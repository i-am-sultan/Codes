// Get the table element
var table = document.querySelector('table');

// Add a click event listener to each row
table.addEventListener('click', function(event) {
  // Check if the click target is a table row
  if (event.target.tagName === 'TR') {
    // Get the reminder message from the clicked row
    var reminder = event.target.lastElementChild.textContent;
    // Show a confirmation dialog to the user
    var confirmed = confirm('Are you sure you want to delete this reminder: ' + reminder + '?');
    if (confirmed) {
      // Remove the clicked row from the table
      event.target.parentNode.removeChild(event.target);
    }
  }
});
