<!DOCTYPE html>
<html lang="pt-br">
<head>
	<title>Exercicios - HealthTrack</title>
	<nav><%@ include file="header.jsp" %> </nav>
</head>
<body>

		<div class="container-fluid">
             
            
            <div class="border border-dark"></div>
            
            <div class="row center">
                
                <h1 style="color: black" class="fs-20">Relatorio semanal <strong class="fs-28" style="font-family: Lobster; color: black;">Exercicio</strong></h1>
    
            
                <div class="border border-dark rounded border-size-info text-center responsive-text col-md-">
                    <h2 class="p-t-10 p-b-10 ">3</h2>
                    <span>Exercicios diferentes feitos essa Semana</span><br>
                    <i class="material-icons md-48">fitness_center</i>
                </div>
                
                <div class="border border-dark rounded border-size-info text-center responsive-text">
                    <h2 class="p-t-10 p-b-10">7.500 kcal</h2>
                    <span>Calorias Queimadas</span><br>
                    <i class="material-icons md-48">whatshot</i>
                    
                
                </div>
                
                <div class="border border-dark rounded border-size-info text-center responsive-text">
                    <h2 class="p-t-10 p-b-10">45x</h2>
                    <span>RepetiÃ§Ãµes em exercicios</span><br>
                    <i class="material-icons md-48">replay_30</i>
                
                </div>
                
                <div class="border border-dark rounded border-size-info text-center responsive-text">
                    <h2 class="p-t-10 p-b-10">+0,3kg</h2>
                    <span>De massa ganho essa semana</span><br>
                    <i class="material-icons md-48">trending_up</i>
                
                </div>
            </div>
            <div class="border border-dark"></div>
            
            <div class="col-sm-8 p-b-20  p-t-20"><h2>Adicionar <b>Exercicio</b></h2></div>
            <div class="center row">
            
	            <div class="p-r-30  p-t-10 p-b-10">
					<div class="wrap-input-register100-text validate-input" data-validate="Name is required">
						<span class="label-input-register100">Qual exercicio você fez?</span>
						<input class="input-register100" type="text" step="0.01" min="0" name="altura" placeholder="Ex: Abdominais, Flexão, Agachamento" required>
						<span class="focus-input-register100"></span>
					</div>
			     </div>
		
	            <div class="p-r-30  p-t-10 p-b-10">
					<div class="wrap-input-register100-text validate-input" data-validate="Name is required">
						<span class="label-input-register100">Quantas repetições você fez?</span>
						<input class="input-register100" type="number" min="0" name="repeat" placeholder="Ex: 200g" required>
						<span class="focus-input-register100"></span>
					</div>
			     </div>       
	            
	             <div class="p-r-30  p-t-10 p-b-10">
					<div class="wrap-input-register100-text validate-input" data-validate="Name is required">
						<span class="label-input-register100">Quantas series?</span>
						<input class="input-register100" type="number"  min="0" name="series" placeholder="" required>
						<span class="focus-input-register100"></span>
					</div>
			    </div>
			    
			    <div class="col-sm-4">
                      <button type="button" class="btn btn-info"><i class="fa fa-plus"></i> Novo Exercicio</button>
                 </div>
            
            </div>
            
            
            
            
            
            <div class="row">
                            <div class="tab1">
                                    <div class="table-wrapper">
                        <div class="table-title">
                            <div class="row">
                                
                                <div class="col-sm-4">
                                    
                                </div>
                            </div>
                        </div>
                        <table class="table table-bordered">
                            <thead>
                                <tr>
                                    <th>Exercicio</th>
                                    <th>Repetições</th>
                                    <th>Data</th>
                                    <th>Ações</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>Abdominal</td>
                                    <td>20x</td>
                                    <td>20/04/2020</td>
                                    <td>
                                        <a class="add" title="Add" data-toggle="tooltip"><i class="material-icons">+</i></a>
                                        <a class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>
                                        <a class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Agachamento Sem Peso</td>
                                    <td>10x</td>
                                    <td>23/04/2020</td>
                                    <td>
                                        <a class="add" title="Add" data-toggle="tooltip"><i class="material-icons">+</i></a>
                                        <a class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>
                                        <a class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Levantamento 5kg</td>
                                    <td>15x</td>
                                    <td>25/04/2020</td>
                                    <td>
                                        <a class="add" title="Add" data-toggle="tooltip"><i class="material-icons">+</i></a>
                                        <a class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>
                                        <a class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
                                    </td>
                                </tr>      
                            </tbody>
                        </table>
                    </div>
           
                </div>
            </div> 
		</div>
	
	

</body>
</html>