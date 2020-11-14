<!DOCTYPE html>
<html lang="pt-br">
<head>
	<title>HealthTrack</title>
	<!--frameworks -->
	<nav><%@ include file="frames.jsp" %> </nav>
</head>
<body>
	
	<div class="limiter">
		<div class="container" style="background-color: white">
             
            <a href="welcome.jsp" type="button" class="btn btn-default" aria-label="Left Align">
 <span class="fas fa-chevron-left fa p-t-20" aria-hidden="true"></span>
 </a>

                    <div class="wrap-text100  p-t-30 p-b-24">
                        <h1 class="fs-22">Conte mais sobre você</h1>
                    </div>

            <form action="questions.jsp">
                   
            <div class="wrap-text100  p-t-10 p-b-10">
				<div class="wrap-input-register100-text validate-input" data-validate="Name is required">
					<span class="label-input-register100">Insira seu nome</span>
					<input class="input-register100" type="text" step="0.01" min="0" name="altura" placeholder="Nome completo" required>
					<span class="focus-input-register100"></span>
				</div>
		     </div>
	
            <div class="wrap-text100  p-t-10 p-b-10">
				<div class="wrap-input-register100 validate-input" data-validate="Name is required">
					<span class="label-input-register100">Insira sua altura</span>
					<input class="input-register100" type="number" step="0.01" min="0" name="altura" placeholder="Ex: 1,85m" required>
					<span class="focus-input-register100"></span>
				</div>
		     </div>       
            
             <div class="wrap-text100  p-t-10 p-b-90">
				<div class="wrap-input-register100 validate-input" data-validate="Name is required">
					<span class="label-input-register100">Insira seu peso</span>
					<input class="input-register100" type="number"  min="0" name="peso" placeholder="Ex: 65kg" required>
					<span class="focus-input-register100"></span>
				</div>
		    </div>
                
            
            <div class="fixed-bottom">
				<button class="next100-form-btn">PRÓXIMO PASSO</button>
            </div>
                
            </form>   
			
		</div>
	</div>

</body>
</html>