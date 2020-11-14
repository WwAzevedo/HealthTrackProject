<!DOCTYPE html>
<html lang="pt-br">
<head>
	<title>HealthTrack</title>
	<!--frameworks -->
	<nav><%@ include file="frames.jsp" %> </nav>
</head>
<body>
	
	
		<div class="container-login100" style="background-image: url('images/background.jpg');">
            
            <div class="d-flex justify-content-center hdiv">
                    <h1 style="color: white">Bem vindo(a) ao <br><strong>Health Track</strong></h1>
                </div>
			<div class="wrap-login100 p-t-50 p-b-90">
				<form class="login100-form validate-form flex-sb flex-w" action="welcome.html">
					<span class="login100-form-title p-b-10">
						Faça seu cadastro
					</span>
					
					<div class="wrap-input100 validate-input m-b-16" data-validate = "Username is required">
						<input class="input100" type="name" name="username" placeholder="Nome" required>
						<span class="focus-input100"></span>
					</div>
                    
                    <div class="wrap-input100 validate-input m-b-16" data-validate = "Username is required">
						<input class="input100" type="email" name="username" placeholder="E-mail" required>
						<span class="focus-input100"></span>
					</div>
					
					
					<div class="wrap-input100 validate-input m-b-16" data-validate = "Password is required">
						<input class="input100" type="password" name="pass" placeholder="Senha" required>
						<span class="focus-input100"></span>
					</div>
					
					<div class="flex-sb-m w-full p-t-3 p-b-24">
						<div class="contact100-form-checkbox">
							<input class="input-checkbox100" id="ckb1" type="checkbox" name="remember-me">
							<label class="label-checkbox100" for="ckb1">
								Li e aceito os termos de uso
							</label>
						</div>
					</div>

					<div class="container-login100-form-btn m-t-17">
                        <button class="btn btn-info login100-form-btn" role="button">Cadastrar</button>
					</div>
                        
                    
				</form>
			</div>
		</div>

</body>
</html>