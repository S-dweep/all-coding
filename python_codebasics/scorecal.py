player_scores={}

with open("C:\\Users\\Sayandeep Mondal\\OneDrive\\Desktop\\coding\\python_codebasics\\scores.csv","r") as f:
    for line in f:
        token=line.split(",")
        player=token[0]
        score=int(token[1])
        if player in player_scores:
            player_scores[player].append(score)
        else:
            player_scores[player]=[score]
        
for player,score in player_scores.items():
    min_score=min(score)
    max_score=max(score)
    avg_score=sum(score)/len(score)
    print(f"{player} ==> min: {min_score}, max: {max_score}, avg: {avg_score}")