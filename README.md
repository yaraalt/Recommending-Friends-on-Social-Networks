# Recommending-Friends-on-Social-Networks
One of the main functionalities offered by online social platforms such as Facebook and Twitter is the recommendation of new friends. This is achieved by utilizing various information about the users, but the main factor used for recommending a new friend to a user is how well these two users are connected. A social network such as Facebook can be represented as undirected graph. We can use the information contained in the graph to select the top candidate friends for a given user. There are many ways to do this, but we will focus on two methods:
- **Popular users**: In this method, we recommend the most popular users in the graph, that is nodes with the highest degrees (number of neighbors).
- **Common neighbors**: In this method, we recommend users who have the most common friends with the user.

## Data Structures
- **Priority Queues**: To recommend top k users, we use a priority queue that keeps only the top k elements and serves them in decreasing order of priority. For this, we have the class PQKImp that implements the interface PQK.
- **Binary Search Tree (BST)**: BST implementation of a map. For this, we have the class BSTMap that implements the interface Map.
- **Graph**: A graph is used to represent the friendship graph. We used adjacency list representation, but instead of an array of lists, we use a map of lists. Each list in the map represents the neighbors of a node. For this, we have the class MGraph that implements the interface Graph. 
