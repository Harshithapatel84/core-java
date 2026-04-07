package com.prg.Forest.card;

public class StorePanCardDetail {
        PanCard[] cards;
        int curtIndex;

        public StorePanCardDetail(PanCard[] cards)
        {
            this.cards=cards;
        }

        public void save(PanCard card)
        {
            System.out.println("executing to store pancard details");
            if(this.cards!=null)
            {
                if(curtIndex<cards.length)
                {
                    this.cards[curtIndex]=card;
                    this.curtIndex++;
                }
                else{
                    System.out.println("array is full");
                }
            }
        }

        public boolean searchByNumber(String no)
        {
            if(this.cards!=null && no!=null)
            {
                for(PanCard panCard:this.cards)
                {
                    if(panCard!=null)
                    {
                        if(no.equals(panCard.no))
                        {
                            System.out.println("found:"+panCard.holderName);
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public boolean updateAddress(String no,String newAddress)
        {
            if(this.cards!=null && no!=null)
            {
                for(PanCard panCard:this.cards)
                {
                    if(panCard!=null)
                    {
                        if(panCard.no == no)
                        {
                            panCard.address=newAddress;
                            System.out.println("updated address:"+panCard.address);
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

