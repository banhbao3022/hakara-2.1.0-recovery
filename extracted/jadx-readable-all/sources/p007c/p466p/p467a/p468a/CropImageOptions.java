package p007c.p466p.p467a.p468a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.theartofdev.edmodo.cropper.CropImageView;
import p636z0.p667e.p676b.C7804v0;

/* JADX INFO: renamed from: c.p.a.a.h, reason: use source file name */
/* JADX INFO: compiled from: CropImageOptions.java */
/* JADX INFO: loaded from: classes.dex */
public class CropImageOptions implements Parcelable {
    public static final Parcelable.Creator<CropImageOptions> CREATOR = new a();

    /* JADX INFO: renamed from: A */
    public int f27994A;

    /* JADX INFO: renamed from: B */
    public int f27995B;

    /* JADX INFO: renamed from: C */
    public int f27996C;

    /* JADX INFO: renamed from: D */
    public int f27997D;

    /* JADX INFO: renamed from: E */
    public int f27998E;

    /* JADX INFO: renamed from: F */
    public int f27999F;

    /* JADX INFO: renamed from: G */
    public int f28000G;

    /* JADX INFO: renamed from: H */
    public int f28001H;

    /* JADX INFO: renamed from: I */
    public CharSequence f28002I;

    /* JADX INFO: renamed from: J */
    public int f28003J;

    /* JADX INFO: renamed from: K */
    public Uri f28004K;

    /* JADX INFO: renamed from: L */
    public Bitmap.CompressFormat f28005L;

    /* JADX INFO: renamed from: M */
    public int f28006M;

    /* JADX INFO: renamed from: N */
    public int f28007N;

    /* JADX INFO: renamed from: O */
    public int f28008O;

    /* JADX INFO: renamed from: P */
    public int f28009P;

    /* JADX INFO: renamed from: Q */
    public boolean f28010Q;

    /* JADX INFO: renamed from: R */
    public Rect f28011R;

    /* JADX INFO: renamed from: S */
    public int f28012S;

    /* JADX INFO: renamed from: T */
    public boolean f28013T;

    /* JADX INFO: renamed from: U */
    public boolean f28014U;

    /* JADX INFO: renamed from: V */
    public boolean f28015V;

    /* JADX INFO: renamed from: W */
    public int f28016W;

    /* JADX INFO: renamed from: X */
    public boolean f28017X;

    /* JADX INFO: renamed from: Y */
    public boolean f28018Y;

    /* JADX INFO: renamed from: Z */
    public CharSequence f28019Z;

    /* JADX INFO: renamed from: a0 */
    public int f28020a0;

    /* JADX INFO: renamed from: f */
    public CropImageView.EnumC6010c f28021f;

    /* JADX INFO: renamed from: g */
    public float f28022g;

    /* JADX INFO: renamed from: h */
    public float f28023h;

    /* JADX INFO: renamed from: i */
    public CropImageView.EnumC6011d f28024i;

    /* JADX INFO: renamed from: j */
    public CropImageView.EnumC6017j f28025j;

    /* JADX INFO: renamed from: k */
    public boolean f28026k;

    /* JADX INFO: renamed from: l */
    public boolean f28027l;

    /* JADX INFO: renamed from: m */
    public boolean f28028m;

    /* JADX INFO: renamed from: n */
    public boolean f28029n;

    /* JADX INFO: renamed from: o */
    public int f28030o;

    /* JADX INFO: renamed from: p */
    public float f28031p;

    /* JADX INFO: renamed from: q */
    public boolean f28032q;

    /* JADX INFO: renamed from: r */
    public int f28033r;

    /* JADX INFO: renamed from: s */
    public int f28034s;

    /* JADX INFO: renamed from: t */
    public float f28035t;

    /* JADX INFO: renamed from: u */
    public int f28036u;

    /* JADX INFO: renamed from: v */
    public float f28037v;

    /* JADX INFO: renamed from: w */
    public float f28038w;

    /* JADX INFO: renamed from: x */
    public float f28039x;

    /* JADX INFO: renamed from: y */
    public int f28040y;

    /* JADX INFO: renamed from: z */
    public float f28041z;

    /* JADX INFO: renamed from: c.p.a.a.h$a */
    /* JADX INFO: compiled from: CropImageOptions.java */
    public static class a implements Parcelable.Creator<CropImageOptions> {
        @Override // android.os.Parcelable.Creator
        public CropImageOptions createFromParcel(Parcel parcel) {
            return new CropImageOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public CropImageOptions[] newArray(int i) {
            return new CropImageOptions[i];
        }
    }

    public CropImageOptions() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        this.f28021f = CropImageView.EnumC6010c.RECTANGLE;
        this.f28022g = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f28023h = TypedValue.applyDimension(1, 24.0f, displayMetrics);
        this.f28024i = CropImageView.EnumC6011d.ON_TOUCH;
        this.f28025j = CropImageView.EnumC6017j.FIT_CENTER;
        this.f28026k = true;
        this.f28027l = true;
        this.f28028m = true;
        this.f28029n = false;
        this.f28030o = 4;
        this.f28031p = 0.1f;
        this.f28032q = false;
        this.f28033r = 1;
        this.f28034s = 1;
        this.f28035t = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f28036u = Color.argb(170, 255, 255, 255);
        this.f28037v = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        this.f28038w = TypedValue.applyDimension(1, 5.0f, displayMetrics);
        this.f28039x = TypedValue.applyDimension(1, 14.0f, displayMetrics);
        this.f28040y = -1;
        this.f28041z = TypedValue.applyDimension(1, 1.0f, displayMetrics);
        this.f27994A = Color.argb(170, 255, 255, 255);
        this.f27995B = Color.argb(119, 0, 0, 0);
        this.f27996C = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.f27997D = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.f27998E = 40;
        this.f27999F = 40;
        this.f28000G = 99999;
        this.f28001H = 99999;
        this.f28002I = "";
        this.f28003J = 0;
        this.f28004K = Uri.EMPTY;
        this.f28005L = Bitmap.CompressFormat.JPEG;
        this.f28006M = 90;
        this.f28007N = 0;
        this.f28008O = 0;
        this.f28009P = 1;
        this.f28010Q = false;
        this.f28011R = null;
        this.f28012S = -1;
        this.f28013T = true;
        this.f28014U = true;
        this.f28015V = false;
        this.f28016W = 90;
        this.f28017X = false;
        this.f28018Y = false;
        this.f28019Z = null;
        this.f28020a0 = 0;
    }

    /* JADX INFO: renamed from: a */
    public void m12527a() {
        if (this.f28030o < 0) {
            throw new IllegalArgumentException("Cannot set max zoom to a number < 1");
        }
        if (this.f28023h < 0.0f) {
            throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ");
        }
        float f = this.f28031p;
        if (f < 0.0f || f >= 0.5d) {
            throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
        }
        if (this.f28033r <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.f28034s <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.f28035t < 0.0f) {
            throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.");
        }
        if (this.f28037v < 0.0f) {
            throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.");
        }
        if (this.f28041z < 0.0f) {
            throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.");
        }
        if (this.f27997D < 0) {
            throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ");
        }
        int i = this.f27998E;
        if (i < 0) {
            throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ");
        }
        int i2 = this.f27999F;
        if (i2 < 0) {
            throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ");
        }
        if (this.f28000G < i) {
            throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width");
        }
        if (this.f28001H < i2) {
            throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height");
        }
        if (this.f28007N < 0) {
            throw new IllegalArgumentException("Cannot set request width value to a number < 0 ");
        }
        if (this.f28008O < 0) {
            throw new IllegalArgumentException("Cannot set request height value to a number < 0 ");
        }
        int i3 = this.f28016W;
        if (i3 < 0 || i3 > 360) {
            throw new IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f28021f.ordinal());
        parcel.writeFloat(this.f28022g);
        parcel.writeFloat(this.f28023h);
        parcel.writeInt(this.f28024i.ordinal());
        parcel.writeInt(this.f28025j.ordinal());
        parcel.writeByte(this.f28026k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f28027l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f28028m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f28029n ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f28030o);
        parcel.writeFloat(this.f28031p);
        parcel.writeByte(this.f28032q ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f28033r);
        parcel.writeInt(this.f28034s);
        parcel.writeFloat(this.f28035t);
        parcel.writeInt(this.f28036u);
        parcel.writeFloat(this.f28037v);
        parcel.writeFloat(this.f28038w);
        parcel.writeFloat(this.f28039x);
        parcel.writeInt(this.f28040y);
        parcel.writeFloat(this.f28041z);
        parcel.writeInt(this.f27994A);
        parcel.writeInt(this.f27995B);
        parcel.writeInt(this.f27996C);
        parcel.writeInt(this.f27997D);
        parcel.writeInt(this.f27998E);
        parcel.writeInt(this.f27999F);
        parcel.writeInt(this.f28000G);
        parcel.writeInt(this.f28001H);
        TextUtils.writeToParcel(this.f28002I, parcel, i);
        parcel.writeInt(this.f28003J);
        parcel.writeParcelable(this.f28004K, i);
        parcel.writeString(this.f28005L.name());
        parcel.writeInt(this.f28006M);
        parcel.writeInt(this.f28007N);
        parcel.writeInt(this.f28008O);
        parcel.writeInt(C7804v0.m15315d(this.f28009P));
        parcel.writeInt(this.f28010Q ? 1 : 0);
        parcel.writeParcelable(this.f28011R, i);
        parcel.writeInt(this.f28012S);
        parcel.writeByte(this.f28013T ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f28014U ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f28015V ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f28016W);
        parcel.writeByte(this.f28017X ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f28018Y ? (byte) 1 : (byte) 0);
        TextUtils.writeToParcel(this.f28019Z, parcel, i);
        parcel.writeInt(this.f28020a0);
    }

    public CropImageOptions(Parcel parcel) {
        this.f28021f = CropImageView.EnumC6010c.values()[parcel.readInt()];
        this.f28022g = parcel.readFloat();
        this.f28023h = parcel.readFloat();
        this.f28024i = CropImageView.EnumC6011d.values()[parcel.readInt()];
        this.f28025j = CropImageView.EnumC6017j.values()[parcel.readInt()];
        this.f28026k = parcel.readByte() != 0;
        this.f28027l = parcel.readByte() != 0;
        this.f28028m = parcel.readByte() != 0;
        this.f28029n = parcel.readByte() != 0;
        this.f28030o = parcel.readInt();
        this.f28031p = parcel.readFloat();
        this.f28032q = parcel.readByte() != 0;
        this.f28033r = parcel.readInt();
        this.f28034s = parcel.readInt();
        this.f28035t = parcel.readFloat();
        this.f28036u = parcel.readInt();
        this.f28037v = parcel.readFloat();
        this.f28038w = parcel.readFloat();
        this.f28039x = parcel.readFloat();
        this.f28040y = parcel.readInt();
        this.f28041z = parcel.readFloat();
        this.f27994A = parcel.readInt();
        this.f27995B = parcel.readInt();
        this.f27996C = parcel.readInt();
        this.f27997D = parcel.readInt();
        this.f27998E = parcel.readInt();
        this.f27999F = parcel.readInt();
        this.f28000G = parcel.readInt();
        this.f28001H = parcel.readInt();
        this.f28002I = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f28003J = parcel.readInt();
        this.f28004K = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f28005L = Bitmap.CompressFormat.valueOf(parcel.readString());
        this.f28006M = parcel.readInt();
        this.f28007N = parcel.readInt();
        this.f28008O = parcel.readInt();
        this.f28009P = C7804v0.m15314x9c31d601()[parcel.readInt()];
        this.f28010Q = parcel.readByte() != 0;
        this.f28011R = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.f28012S = parcel.readInt();
        this.f28013T = parcel.readByte() != 0;
        this.f28014U = parcel.readByte() != 0;
        this.f28015V = parcel.readByte() != 0;
        this.f28016W = parcel.readInt();
        this.f28017X = parcel.readByte() != 0;
        this.f28018Y = parcel.readByte() != 0;
        this.f28019Z = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f28020a0 = parcel.readInt();
    }
}
