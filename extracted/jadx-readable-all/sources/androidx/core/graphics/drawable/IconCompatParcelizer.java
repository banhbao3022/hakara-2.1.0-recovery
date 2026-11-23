package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import java.nio.charset.Charset;
import java.util.Objects;
import p636z0.p692g0.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f675b = versionedParcel.m15632k(iconCompat.f675b, 1);
        byte[] bArrMo15628g = iconCompat.f677d;
        if (versionedParcel.mo15630i(2)) {
            bArrMo15628g = versionedParcel.mo15628g();
        }
        iconCompat.f677d = bArrMo15628g;
        iconCompat.f678e = versionedParcel.m15634m(iconCompat.f678e, 3);
        iconCompat.f679f = versionedParcel.m15632k(iconCompat.f679f, 4);
        iconCompat.f680g = versionedParcel.m15632k(iconCompat.f680g, 5);
        iconCompat.f681h = (ColorStateList) versionedParcel.m15634m(iconCompat.f681h, 6);
        String strMo15635n = iconCompat.f683j;
        if (versionedParcel.mo15630i(7)) {
            strMo15635n = versionedParcel.mo15635n();
        }
        iconCompat.f683j = strMo15635n;
        String strMo15635n2 = iconCompat.f684k;
        if (versionedParcel.mo15630i(8)) {
            strMo15635n2 = versionedParcel.mo15635n();
        }
        iconCompat.f684k = strMo15635n2;
        iconCompat.f682i = PorterDuff.Mode.valueOf(iconCompat.f683j);
        switch (iconCompat.f675b) {
            case -1:
                Parcelable parcelable = iconCompat.f678e;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f676c = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f678e;
                if (parcelable2 != null) {
                    iconCompat.f676c = parcelable2;
                } else {
                    byte[] bArr = iconCompat.f677d;
                    iconCompat.f676c = bArr;
                    iconCompat.f675b = 3;
                    iconCompat.f679f = 0;
                    iconCompat.f680g = bArr.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f677d, Charset.forName("UTF-16"));
                iconCompat.f676c = str;
                if (iconCompat.f675b == 2 && iconCompat.f684k == null) {
                    iconCompat.f684k = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f676c = iconCompat.f677d;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        Objects.requireNonNull(versionedParcel);
        iconCompat.f683j = iconCompat.f682i.name();
        switch (iconCompat.f675b) {
            case -1:
                iconCompat.f678e = (Parcelable) iconCompat.f676c;
                break;
            case 1:
            case 5:
                iconCompat.f678e = (Parcelable) iconCompat.f676c;
                break;
            case 2:
                iconCompat.f677d = ((String) iconCompat.f676c).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f677d = (byte[]) iconCompat.f676c;
                break;
            case 4:
            case 6:
                iconCompat.f677d = iconCompat.f676c.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f675b;
        if (-1 != i) {
            versionedParcel.mo15637p(1);
            versionedParcel.mo15641t(i);
        }
        byte[] bArr = iconCompat.f677d;
        if (bArr != null) {
            versionedParcel.mo15637p(2);
            versionedParcel.mo15639r(bArr);
        }
        Parcelable parcelable = iconCompat.f678e;
        if (parcelable != null) {
            versionedParcel.mo15637p(3);
            versionedParcel.mo15642u(parcelable);
        }
        int i2 = iconCompat.f679f;
        if (i2 != 0) {
            versionedParcel.mo15637p(4);
            versionedParcel.mo15641t(i2);
        }
        int i3 = iconCompat.f680g;
        if (i3 != 0) {
            versionedParcel.mo15637p(5);
            versionedParcel.mo15641t(i3);
        }
        ColorStateList colorStateList = iconCompat.f681h;
        if (colorStateList != null) {
            versionedParcel.mo15637p(6);
            versionedParcel.mo15642u(colorStateList);
        }
        String str = iconCompat.f683j;
        if (str != null) {
            versionedParcel.mo15637p(7);
            versionedParcel.mo15643v(str);
        }
        String str2 = iconCompat.f684k;
        if (str2 != null) {
            versionedParcel.mo15637p(8);
            versionedParcel.mo15643v(str2);
        }
    }
}
