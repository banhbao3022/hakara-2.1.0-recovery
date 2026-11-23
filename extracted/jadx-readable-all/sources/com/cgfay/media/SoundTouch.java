package com.cgfay.media;

/* JADX INFO: loaded from: classes.dex */
public class SoundTouch {
    private long handle = nativeInit();

    static {
        System.loadLibrary("soundtouch");
    }

    private native void flush(long j2);

    private static native long nativeInit();

    private native void nativeRelease(long j2);

    private native void putSamples(long j2, byte[] bArr, int i, int i2);

    private native int receiveSamples(long j2, byte[] bArr, int i);

    private native void setChannels(long j2, int i);

    private native void setPitch(long j2, float f);

    private native void setPitchOctaves(long j2, float f);

    private native void setPitchSemiTones(long j2, float f);

    private native void setRate(long j2, double d);

    private native void setRateChange(long j2, double d);

    private native void setSampleRate(long j2, int i);

    private native void setTempo(long j2, float f);

    private native void setTempoChange(long j2, float f);

    public void close() {
        nativeRelease(this.handle);
        this.handle = 0L;
    }

    public void finalize() throws Throwable {
        if (this.handle != 0) {
            close();
        }
        super.finalize();
    }

    public void flush() {
        flush(this.handle);
    }

    public void putSamples(byte[] bArr) {
        putSamples(this.handle, bArr, 0, bArr.length);
    }

    public int receiveSamples(byte[] bArr) {
        return receiveSamples(this.handle, bArr, bArr.length);
    }

    public void setChannels(int i) {
        setChannels(this.handle, i);
    }

    public void setPitch(float f) {
        setPitch(this.handle, f);
    }

    public void setPitchOctaves(float f) {
        setPitchOctaves(this.handle, f);
    }

    public void setPitchSemiTones(float f) {
        setPitchSemiTones(this.handle, f);
    }

    public void setRate(double d) {
        setRate(this.handle, d);
    }

    public void setRateChange(double d) {
        setRateChange(this.handle, d);
    }

    public void setSampleRate(int i) {
        setSampleRate(this.handle, i);
    }

    public void setTempo(float f) {
        setTempo(this.handle, f);
    }

    public void setTempoChange(float f) {
        setTempoChange(this.handle, f);
    }
}
