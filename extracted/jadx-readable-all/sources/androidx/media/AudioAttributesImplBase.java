package androidx.media;

import android.util.SparseIntArray;
import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a */
    public int f805a = 0;

    /* JADX INFO: renamed from: b */
    public int f806b = 0;

    /* JADX INFO: renamed from: c */
    public int f807c = 0;

    /* JADX INFO: renamed from: d */
    public int f808d = -1;

    @Override // androidx.media.AudioAttributesImpl
    /* JADX INFO: renamed from: a */
    public Object mo440a() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public int m443b() {
        int i = this.f807c;
        int i2 = this.f808d;
        if (i2 == -1) {
            int i3 = this.f805a;
            SparseIntArray sparseIntArray = AudioAttributesCompat.f799a;
            if ((i & 1) != 1) {
                if ((i & 4) != 4) {
                    switch (i3) {
                        case 2:
                            i2 = 0;
                            break;
                        case 3:
                            i2 = 8;
                            break;
                        case 4:
                            i2 = 4;
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i2 = 5;
                            break;
                        case 6:
                            i2 = 2;
                            break;
                        case 11:
                            i2 = 10;
                            break;
                        case 12:
                        default:
                            i2 = 3;
                            break;
                        case 13:
                            i2 = 1;
                            break;
                    }
                } else {
                    i2 = 6;
                }
            } else {
                i2 = 7;
            }
        }
        if (i2 == 6) {
            i |= 4;
        } else if (i2 == 7) {
            i |= 1;
        }
        return i & 273;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f806b == audioAttributesImplBase.f806b && this.f807c == audioAttributesImplBase.m443b() && this.f805a == audioAttributesImplBase.f805a && this.f808d == audioAttributesImplBase.f808d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f806b), Integer.valueOf(this.f807c), Integer.valueOf(this.f805a), Integer.valueOf(this.f808d)});
    }

    public String toString() {
        String strM1590l;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f808d != -1) {
            sb.append(" stream=");
            sb.append(this.f808d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f805a;
        SparseIntArray sparseIntArray = AudioAttributesCompat.f799a;
        switch (i) {
            case 0:
                strM1590l = "USAGE_UNKNOWN";
                break;
            case 1:
                strM1590l = "USAGE_MEDIA";
                break;
            case 2:
                strM1590l = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strM1590l = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strM1590l = "USAGE_ALARM";
                break;
            case 5:
                strM1590l = "USAGE_NOTIFICATION";
                break;
            case 6:
                strM1590l = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strM1590l = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strM1590l = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strM1590l = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strM1590l = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strM1590l = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strM1590l = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strM1590l = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strM1590l = "USAGE_GAME";
                break;
            case 15:
            default:
                strM1590l = outline.m1590l("unknown usage ", i);
                break;
            case 16:
                strM1590l = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strM1590l);
        sb.append(" content=");
        sb.append(this.f806b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f807c).toUpperCase());
        return sb.toString();
    }
}
