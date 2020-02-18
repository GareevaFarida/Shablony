package ru.geekbrains.patterns.lesson4.proxy;

public class PhotoData {

    //в этом массиве хранятся "тяжелые" данные
    private byte[] data;
    private Photo photo;

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }
}
