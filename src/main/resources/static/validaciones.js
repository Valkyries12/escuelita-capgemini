/**
 * 
 */
let inputs = document.querySelectorAll(".form-control");
let submitBtn = document.querySelector(".btn-success");
let nom = document.querySelector("#nombre_alumno");
//le saaca todos los espacios a los inputs al apretar boton submit
submitBtn.addEventListener("click", function(){
	for(let i = 0; i < inputs.length; i++){
		inputs[i].value.trim();
	}
	
});
	