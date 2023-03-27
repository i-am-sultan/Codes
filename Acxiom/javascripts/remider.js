function setReminder() {
    var reminder = document.getElementById("reminder").value;
    var date = document.getElementById("date").value;
    var time = document.getElementById("time").value;
    var dateTime = date + " " + time;
    
    var reminderList = document.getElementById("reminderList");
    var reminderItem = document.createElement("div");
    reminderItem.innerHTML = "<p>" + reminder + " - " + dateTime + "</p>";
    reminderList.appendChild(reminderItem);
    
    document.getElementById("reminder").value = "";
    document.getElementById("date").value = "";
    document.getElementById("time").value = "";
  }
  