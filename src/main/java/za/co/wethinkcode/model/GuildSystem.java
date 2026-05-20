package za.co.wethinkcode.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GuildSystem {
    private String guildName;
    private List<Player> members;
    private List<Match> matchQueue; //acts as queue FIFO first in first out principle
    private int memberCounter;

    public GuildSystem(String guildName){
        this.guildName = guildName;

        this.members = new ArrayList<>();
        this.matchQueue = new ArrayList<>();

        this.memberCounter = 0;
    }

   public void addMember(Player member){
        members.add(member);
   }

   public boolean removeMemberById(int id){
       return this.members.removeIf(member -> member.getId() == id);

   }

   public Player getMemberById(int id){
       for(Player member: members){
           if (member.getId() == id){
               return member;
           }
       }
       return null;
   }

   public List<Player> getAllMembers(){
        return Collections.unmodifiableList(this.members);
   }

   public Match createMatch(int member1ID , int member2ID){
        Match match = new Match();

        this.matchQueue.add(match);
        return match;

   }

}
