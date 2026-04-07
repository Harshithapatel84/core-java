package com.prg.Forest.hospital;

public class MedicalDetail {
    Medical[] medicals;
    int curtIndex;

    public MedicalDetail(Medical[] medicals)
    {
        this.medicals=medicals;
    }

    public void save(Medical medical)
    {
        System.out.println("executing to store medical details");
        if(this.medicals!=null)
        {
            if(curtIndex<medicals.length)
            {
                this.medicals[curtIndex]=medical;
                this.curtIndex++;
            }
            else{
                System.out.println("array is full");
            }
        }
    }

    public boolean searchByName(String name)
    {
        if(this.medicals!=null && name!=null)
        {
            for(Medical medical:this.medicals)
            {
                if(medical!=null)
                {
                    System.out.println("check with name:"+medical.name);
                    if(name.equals(medical.name))
                    {
                        System.out.println("name:"+medical.name);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean updateWorkers(String name,int newWorkers)
    {
        if(this.medicals!=null && name!=null)
        {
            for(Medical medical:this.medicals)
            {
                if(medical!=null)
                {
                    if(name.equals(medical.name))
                    {
                        medical.noOfWorker=newWorkers;
                        System.out.println("updated workers:"+medical.noOfWorker);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

