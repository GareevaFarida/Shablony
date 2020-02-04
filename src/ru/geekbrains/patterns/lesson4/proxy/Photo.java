package ru.geekbrains.patterns.lesson4.proxy;

public class Photo {
    private String filename;
    private Long size;
    //ссылка на объект, хранящий "тяжелые" данные
    private PhotoData photoData;
    private Person owner;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public PhotoData getPhotoData() {
        return photoData;
    }

    public void setPhotoData(PhotoData photoData) {
        this.photoData = photoData;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
