package p007c.p190n.p194b.p209b.p234u1.p241o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: c.n.b.b.u1.o.d, reason: use source file name */
/* JADX INFO: compiled from: SpliceInsertCommand.java */
/* JADX INFO: loaded from: classes.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final long f8775f;

    /* JADX INFO: renamed from: g */
    public final boolean f8776g;

    /* JADX INFO: renamed from: h */
    public final boolean f8777h;

    /* JADX INFO: renamed from: i */
    public final boolean f8778i;

    /* JADX INFO: renamed from: j */
    public final boolean f8779j;

    /* JADX INFO: renamed from: k */
    public final long f8780k;

    /* JADX INFO: renamed from: l */
    public final long f8781l;

    /* JADX INFO: renamed from: m */
    public final List<b> f8782m;

    /* JADX INFO: renamed from: n */
    public final boolean f8783n;

    /* JADX INFO: renamed from: o */
    public final long f8784o;

    /* JADX INFO: renamed from: p */
    public final int f8785p;

    /* JADX INFO: renamed from: q */
    public final int f8786q;

    /* JADX INFO: renamed from: r */
    public final int f8787r;

    /* JADX INFO: renamed from: c.n.b.b.u1.o.d$a */
    /* JADX INFO: compiled from: SpliceInsertCommand.java */
    public class a implements Parcelable.Creator<SpliceInsertCommand> {
        @Override // android.os.Parcelable.Creator
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public SpliceInsertCommand[] newArray(int i) {
            return new SpliceInsertCommand[i];
        }
    }

    public SpliceInsertCommand(long j2, boolean z, boolean z2, boolean z3, boolean z4, long j3, long j4, List<b> list, boolean z5, long j5, int i, int i2, int i3) {
        this.f8775f = j2;
        this.f8776g = z;
        this.f8777h = z2;
        this.f8778i = z3;
        this.f8779j = z4;
        this.f8780k = j3;
        this.f8781l = j4;
        this.f8782m = Collections.unmodifiableList(list);
        this.f8783n = z5;
        this.f8784o = j5;
        this.f8785p = i;
        this.f8786q = i2;
        this.f8787r = i3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8775f);
        parcel.writeByte(this.f8776g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8777h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8778i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8779j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f8780k);
        parcel.writeLong(this.f8781l);
        int size = this.f8782m.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f8782m.get(i2);
            parcel.writeInt(bVar.f8788a);
            parcel.writeLong(bVar.f8789b);
            parcel.writeLong(bVar.f8790c);
        }
        parcel.writeByte(this.f8783n ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f8784o);
        parcel.writeInt(this.f8785p);
        parcel.writeInt(this.f8786q);
        parcel.writeInt(this.f8787r);
    }

    /* JADX INFO: renamed from: c.n.b.b.u1.o.d$b */
    /* JADX INFO: compiled from: SpliceInsertCommand.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f8788a;

        /* JADX INFO: renamed from: b */
        public final long f8789b;

        /* JADX INFO: renamed from: c */
        public final long f8790c;

        public b(int i, long j2, long j3) {
            this.f8788a = i;
            this.f8789b = j2;
            this.f8790c = j3;
        }

        public b(int i, long j2, long j3, a aVar) {
            this.f8788a = i;
            this.f8789b = j2;
            this.f8790c = j3;
        }
    }

    public SpliceInsertCommand(Parcel parcel, a aVar) {
        this.f8775f = parcel.readLong();
        this.f8776g = parcel.readByte() == 1;
        this.f8777h = parcel.readByte() == 1;
        this.f8778i = parcel.readByte() == 1;
        this.f8779j = parcel.readByte() == 1;
        this.f8780k = parcel.readLong();
        this.f8781l = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new b(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f8782m = Collections.unmodifiableList(arrayList);
        this.f8783n = parcel.readByte() == 1;
        this.f8784o = parcel.readLong();
        this.f8785p = parcel.readInt();
        this.f8786q = parcel.readInt();
        this.f8787r = parcel.readInt();
    }
}
