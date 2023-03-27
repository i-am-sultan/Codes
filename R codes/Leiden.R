library(igraphdata)
library(igraph)
#?cluster_leiden
#data(karate)
g<-read.graph('C:\\Users\\offic\\Desktop\\PROJECT CDBN\\Algorithms\\#5 LOUVAIN\\yeast_ppi.gml',format=c("gml"))
print(g)
plot(g)

gc <- cluster_leiden(g)
length(gc)
sizes(gc)
membership(gc)
plot(gc,g)

kc.cpm1 <- kc  #In case I need this later
n <- length(V(karate)) #number vertices
graph.density(karate)
length(E(karate))/(n*(n-1)/2)
sum(E(karate)$weight)/(n*(n-1)/2)
kc <- cluster_leiden(karate, 
                     resolution_parameter = sum(E(karate)$weight)/(n*(n-1)/2))
length(kc)
sizes(kc)
membership(kc)
plot(kc,karate)
kc.cpmdens <- kc
table(membership(kc.cpm1),membership(kc.cpmdens))
karate.unweighted <- delete_edge_attr(karate,"weight")
plot(karate.unweighted)
kc <- cluster_leiden(karate.unweighted)
length(kc)
plot(kc,karate)
