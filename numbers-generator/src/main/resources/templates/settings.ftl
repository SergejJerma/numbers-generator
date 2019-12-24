<#import "parts/common.ftl" as c> <@c.page>

<div>
<h3>Current generator settings</h3>
</div>
<div class="form-group mt-3">	
	<form method="post" enctype="multipart/form-data">
		<div class="input-group">
			<div class="form-group">
				<label class="font-weight-bold">Factor A:</label>
			 	<input type="number" class="form-control" value = "${generator.factorA}" placeholder = "${generator.factorA}" name = "factorA" required>
				<label class="font-weight-bold">Factor B:</label>
			 	<input type="number" class="form-control" value ="${generator.factorB}" placeholder = "${generator.factorB}" name = "factorB" required>
			 	<label class="font-weight-bold">Divider:</label>
			 	<input type="number" class="form-control" value ="${generator.divider}" placeholder = "${generator.divider}" name = "divider" required>
			 	<label class="font-weight-bold">Iteration number:</label>
			 	<input type="number" class="form-control" value = "${generator.iterationNumber}" placeholder = "${generator.iterationNumber}" name = "iterationNumber" min = 1 required>
				<label class="font-weight-bold">Comparition (Last bits number):</label>
			 	<input type="number" class="form-control" value = "${generator.lastBitsNumber}" placeholder = "${generator.lastBitsNumber}" name = "lastBitsNumber" min = 1 required>
			</div>
		</div>
		<div class="form-group">
			<button type="submit" class="btn btn-info">Update all settings</button>
		</div>
	</form>
</div>

</@c.page>