package androidx.media;

import java.util.Objects;
import p636z0.p692g0.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f805a = versionedParcel.m15632k(audioAttributesImplBase.f805a, 1);
        audioAttributesImplBase.f806b = versionedParcel.m15632k(audioAttributesImplBase.f806b, 2);
        audioAttributesImplBase.f807c = versionedParcel.m15632k(audioAttributesImplBase.f807c, 3);
        audioAttributesImplBase.f808d = versionedParcel.m15632k(audioAttributesImplBase.f808d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        Objects.requireNonNull(versionedParcel);
        int i = audioAttributesImplBase.f805a;
        versionedParcel.mo15637p(1);
        versionedParcel.mo15641t(i);
        int i2 = audioAttributesImplBase.f806b;
        versionedParcel.mo15637p(2);
        versionedParcel.mo15641t(i2);
        int i3 = audioAttributesImplBase.f807c;
        versionedParcel.mo15637p(3);
        versionedParcel.mo15641t(i3);
        int i4 = audioAttributesImplBase.f808d;
        versionedParcel.mo15637p(4);
        versionedParcel.mo15641t(i4);
    }
}
