console.log("this is script file");

let toggleSidebar = () => {

	if ($(".sidebar").is(":visible")) {

		// true (mtlb sidebar dikh rha hai)
		// sidebar band krna hai

		$(".sidebar").css("display", "none");
		$(".content").css("margin-left", "0%");
	}
	else {
		//false (sidebar nhi dikh rha hai)

		$(".sidebar").css("display", "block");
		$(".content").css("margin-left", "20%");
	}

};