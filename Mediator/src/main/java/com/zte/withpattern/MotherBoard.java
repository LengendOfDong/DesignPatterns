package com.zte.withpattern;

/**
 * @author dadongge
 * @date 2020/1/25
 */
public class MotherBoard implements Mediator{
    private CDDriver cdDriver = null;

    private CPU cpu;

    private VideoCard videoCard = null;

    private SoundCard soundCard = null;

    public void setCdDriver(CDDriver cdDriver){
        this.cdDriver = cdDriver;
    }

    public void setCpu(CPU cpu){
        this.cpu = cpu;
    }

    public void setVideoCard(VideoCard videoCard){
        this.videoCard = videoCard;
    }

    public void setSoundCard(SoundCard soundCard){
        this.soundCard = soundCard;
    }

    @Override
    public void changed(Colleague colleague) {
        if(colleague == cdDriver){
            //表示光驱读取数据了
            this.opeCDDriverReadData((CDDriver)colleague);
        }else if(colleague == cpu){
            //表示CPU处理完了
            this.opeCPU((CPU)colleague);
        }
    }

    private void opeCDDriverReadData(CDDriver cd){
        //1.先获取光驱读取的数据
        String data = cd.getData();
        //2.把这些数据传递给cpu进行处理
        this.cpu.executeData(data);

    }

    private void opeCPU(CPU cpu){
        //1.先获取CPU处理后的数据
        String videoData = cpu.getVideoData();
        String soundData = cpu.getSoundData();
        //2.把这些数据传递给显卡和声卡展示出来
        this.videoCard.showData(videoData);
        this.soundCard.soundData(soundData);
    }
}
