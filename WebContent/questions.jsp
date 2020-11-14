<!DOCTYPE html>
<html lang="pt-br">
<head>
	<title>HealthTrack</title>
	<!--frameworks -->
	<nav><%@ include file="frames.jsp" %> </nav>
</head>
<body>
	
	
		<div class="container" style="background-color: white">
             
            <a href="imc.jsp" type="button" class="btn btn-default" aria-label="Left Align">
 <span class="fas fa-chevron-left fa p-t-20" aria-hidden="true"></span>
 </a>
            
            <div class="wrap-text100  p-t-30 p-b-24">
                        <h1 class="fs-22">Conte mais sobre você</h1>
                    </div>
 
                <div class="container-md">
		
		<form class="form cf" action="briefing.jsp">
			<section class="plan cf">
				    <div class="p-t-30 p-b-10">
                        <h1 class="label-input-register100">Qual é seu objetivo?</h1>
                    </div>
				<input type="radio" name="radio1" id="free" value="free"><label class="free-label four col" for="free">Perder Peso</label>
				<input type="radio" name="radio1" id="basic" value="basic" checked><label class="basic-label four col" for="basic">Hipertrofia</label>
				<input type="radio" name="radio1" id="premium" value="premium"><label class="premium-label four col" for="premium">Manter a Forma</label>
			</section>
			<section class="payment-plan cf">
				<div class="p-t-20 p-b-10">
                        <h1 class="label-input-register100">Eu sou</h1>
                    </div>
				<input type="radio" name="radio2" id="monthly" value="monthly" checked><label class="monthly-label four col" for="monthly">Homem</label>
				<input type="radio" name="radio2" id="yearly" value="yearly"><label class="yearly-label four col" for="yearly">Mulher</label>
			</section>
			<section class="payment-type cf p-b-80">
				<div class="p-t-20 p-b-10">
                        <h1 class="label-input-register100">Como você classifica sua rotina?</h1>
                    </div>
				<input type="radio" name="radio3" id="credit" value="credit"><label class="credit-label four col" for="credit">Ativa</label>
                <p class="fs-12 p-b-10 text-center">Pratico algum tipo de esporte 5x por semana</p>
				<input type="radio" name="radio3" id="debit" value="debit"><label class="debit-label four col" for="debit">Moderada</label>
                <p class="fs-12 p-b-10 text-center">Pratico atividade física algumas vezes por semana</p>
				<input type="radio" name="radio3" id="paypal" value="paypal" checked><label class="paypal-label four col" for="paypal">SedentÃ¡ria</label>
                <p class="fs-12 p-b-10 text-center">Atualmente não pratico nenhuma atividade física</p>
			</section>	
			 <div class="fixed-bottom">
				<button type="submit" value="Submit" class="next100-form-btn">PRÓXIMO PASSO</button>
            </div>
            	
		</form>
	</div>
			
		</div>

</body>
</html>