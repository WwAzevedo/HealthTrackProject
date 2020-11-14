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
                
                <h1 style="color: black" class="fs-20">Relatorio semanal <strong class="fs-28" style="font-family: Lobster; color: black;">Pressão Arterial</strong></h1>
    
            
                <div class="border border-dark rounded border-size-info text-center responsive-text col-md-">
                    <h2 class="p-t-10 p-b-10 ">3.4</h2>
                    <span>Pontos de oscilação essa semana</span><br>
                    <i class="material-icons md-48">fitness_center</i>
                </div>
                
                <div class="border border-dark rounded border-size-info text-center responsive-text">
                    <h2 class="p-t-10 p-b-10">13x3</h2>
                    <span>Média da semana</span><br>
                    <i class="material-icons md-48">whatshot</i>
                    
                
                </div>
                
                <div class="border border-dark rounded border-size-info text-center responsive-text">
                    <h2 class="p-t-10 p-b-10">12x9</h2>
                    <span>Média do mês</span><br>
                    <i class="material-icons md-48">replay_30</i>
                
                </div>
                
                <div class="border border-dark rounded border-size-info text-center responsive-text">
                    <h2 class="p-t-10 p-b-10">12x4</h2>
                    <span>Pressão mais baixa</span><br>
                    <i class="material-icons md-48">trending_down</i>
                
                </div>
            </div>
            <div class="border border-dark"></div>
            
            <div class="col-sm-8 p-b-20  p-t-20"><h2>Adicionar <b>Pressao</b></h2></div>
            <div class="center row">
            
            
	            <div class="p-r-30  p-t-10 p-b-10">
					<div class="wrap-input-register100-text validate-input" data-validate="Name is required">
						<span class="label-input-register100">Insira sua pressão arterial</span>
						<input class="input-register100" type="number" min="0" name="repeat" placeholder="Ex: 12" required>
						<span class="focus-input-register100"></span>
					</div>
			     </div>       
			     
			     
			     <div class="p-r-30  p-t-10 p-b-10">
					
						<span class="label-input-register100"></span>
						<span class="col-sm-8"><b>por</b></span>
						
				
			    </div>
	            
	
	            
	             <div class="p-r-30  p-t-10 p-b-10">
					<div class="wrap-input-register100-text validate-input" data-validate="Name is required">
						<span class="label-input-register100"></span>
						<input class="input-register100" type="number"  min="0" name="series" placeholder="Ex: 5" required>
						<span class="focus-input-register100"></span>
					</div>
			    </div>
			    
			    <div class="col-sm-4">
                      <button type="button" class="btn btn-info"><i class="fa fa-plus"></i> Novo Registro</button>
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
                                    <th>Histórico</th>
                                    <th>Data</th>
                                    <th>Ações</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>12x5</td>
                                    <td>20/04/2020</td>
                                    <td>
                                        <a class="add" title="Add" data-toggle="tooltip"><i class="material-icons">+</i></a>
                                        <a class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>
                                        <a class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
                                    </td>
                                </tr>
                                <tr>
                                    <td>13x6</td>
                                    <td>23/04/2020</td>
                                    <td>
                                        <a class="add" title="Add" data-toggle="tooltip"><i class="material-icons">+</i></a>
                                        <a class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>
                                        <a class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
                                    </td>
                                </tr>
                                <tr>
                                    <td>12x8</td>
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