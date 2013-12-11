var data = new Array();

var user = new User("Jan", "banaan", "ceo");

var bericht1 = new Bericht("Hallo, ik had een vragen over java",
		"Vraagje java", user, "15:00", "19-03-2013");
var bericht2 = new Bericht("Hallo, ik had een vragen over c++", "Vraagje c++",
		user, "08:00", "04-11-2013");
var bericht3 = new Bericht("Hallo, ik had een vragen over HTML",
		"Vraagje HTML", user, "11:00", "05-12-2013");

console.log(bericht1, bericht2, bericht3);

data[0] = bericht1;
data[1] = bericht2;
data[2] = bericht3;

function Bericht(message, subject, user, time, date) {
	this.message = message;
	this.subject = subject;
	this.user = user;
	this.time = time;
	this.date = date;
}

function User(Name, etc, functie) {
	this.Name = Name;
	this.etc = etc;
	this.functie = functie;
}

// <div class="span2 pull-left message-people">
// <div class="pic"></div>
// 
// </div>
// <div class="span8 pull-left message-content"></div>
// <div class="span2 pull-right message-options">
// <ul class="unstyled tRight">
// <li><a href="#"><i class="icon-share-alt"></i> Reply</a></li>
// <li><a href="#"><i class="icon-share"></i> Forward</a></li>
// </ul>
// </div>

function fillInbox() {
	for ( var i = 0; i < data.length; i++) {
		$('#inbox')
				.append(

						'<div class="message-item borBox"><div class="row-fluid"><div class="span2 pull-left message-people"><div class="pic"></div><div class="info"><a class="name">'
								+ data[i].user.Name
								+ '</a><br><a href="#">'
								+ data[i].user.functie
								+ '</a><h6>'
								+ data[i].date
								+ '</h6></div></div><div class="span8 pull-left message-content">'
								+ data[i].message
								+ '</div><div class="span2 pull-right message-options"><ul class="unstyled tRight"><li><a href="#"><i class="icon-share-alt"></i> Reply</a></li><li><a href="#"><i class="icon-share"></i> Forward</a></li></ul></div></div></div>'

				);
	}

}

$(document).ready(fillInbox);