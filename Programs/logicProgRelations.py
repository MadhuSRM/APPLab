from kanren import run, var, conde, Relation, facts

# Define the relation
parent = Relation()

# Add facts to the relation
facts(parent, ('Jawaharlal', 'Indra'), 
              ('Feroz','Rajiv'),
              ('Indra', 'Rajiv'), 
              ('Stefano','Sonia'),
              ('Sonia','Rahul'),
              ('Indra','Sanjay'), 
              ('Motilal','Jawaharlal'),
              ('Rajiv', 'Rahul'))

# Create a logic variable
x = var()

# Define a rule using conde
def grandParent(x, y):
    z = var()
    return conde(
        (parent(x, z), 
         parent(z, y))
    )
    
# Query the relation
results = run(0, x, grandParent(x,"Rahul"))
print(list(results))
