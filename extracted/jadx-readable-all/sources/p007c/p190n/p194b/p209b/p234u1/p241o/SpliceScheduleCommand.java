package p007c.p190n.p194b.p209b.p234u1.p241o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: c.n.b.b.u1.o.f, reason: use source file name */
/* JADX INFO: compiled from: SpliceScheduleCommand.java */
/* JADX INFO: loaded from: classes.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final List<c> f8791f;

    /* JADX INFO: renamed from: c.n.b.b.u1.o.f$a */
    /* JADX INFO: compiled from: SpliceScheduleCommand.java */
    public class a implements Parcelable.Creator<SpliceScheduleCommand> {
        @Override // android.os.Parcelable.Creator
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public SpliceScheduleCommand[] newArray(int i) {
            return new SpliceScheduleCommand[i];
        }
    }

    public SpliceScheduleCommand(List<c> list) {
        this.f8791f = Collections.unmodifiableList(list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f8791f.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = this.f8791f.get(i2);
            parcel.writeLong(cVar.f8794a);
            parcel.writeByte(cVar.f8795b ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.f8796c ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.f8797d ? (byte) 1 : (byte) 0);
            int size2 = cVar.f8799f.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                b bVar = cVar.f8799f.get(i3);
                parcel.writeInt(bVar.f8792a);
                parcel.writeLong(bVar.f8793b);
            }
            parcel.writeLong(cVar.f8798e);
            parcel.writeByte(cVar.f8800g ? (byte) 1 : (byte) 0);
            parcel.writeLong(cVar.f8801h);
            parcel.writeInt(cVar.f8802i);
            parcel.writeInt(cVar.f8803j);
            parcel.writeInt(cVar.f8804k);
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.u1.o.f$b */
    /* JADX INFO: compiled from: SpliceScheduleCommand.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f8792a;

        /* JADX INFO: renamed from: b */
        public final long f8793b;

        public b(int i, long j2) {
            this.f8792a = i;
            this.f8793b = j2;
        }

        public b(int i, long j2, a aVar) {
            this.f8792a = i;
            this.f8793b = j2;
        }
    }

    public SpliceScheduleCommand(Parcel parcel, a aVar) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new c(parcel));
        }
        this.f8791f = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: c.n.b.b.u1.o.f$c */
    /* JADX INFO: compiled from: SpliceScheduleCommand.java */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final long f8794a;

        /* JADX INFO: renamed from: b */
        public final boolean f8795b;

        /* JADX INFO: renamed from: c */
        public final boolean f8796c;

        /* JADX INFO: renamed from: d */
        public final boolean f8797d;

        /* JADX INFO: renamed from: e */
        public final long f8798e;

        /* JADX INFO: renamed from: f */
        public final List<b> f8799f;

        /* JADX INFO: renamed from: g */
        public final boolean f8800g;

        /* JADX INFO: renamed from: h */
        public final long f8801h;

        /* JADX INFO: renamed from: i */
        public final int f8802i;

        /* JADX INFO: renamed from: j */
        public final int f8803j;

        /* JADX INFO: renamed from: k */
        public final int f8804k;

        public c(long j2, boolean z, boolean z2, boolean z3, List<b> list, long j3, boolean z4, long j4, int i, int i2, int i3) {
            this.f8794a = j2;
            this.f8795b = z;
            this.f8796c = z2;
            this.f8797d = z3;
            this.f8799f = Collections.unmodifiableList(list);
            this.f8798e = j3;
            this.f8800g = z4;
            this.f8801h = j4;
            this.f8802i = i;
            this.f8803j = i2;
            this.f8804k = i3;
        }

        public c(Parcel parcel) {
            this.f8794a = parcel.readLong();
            this.f8795b = parcel.readByte() == 1;
            this.f8796c = parcel.readByte() == 1;
            this.f8797d = parcel.readByte() == 1;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new b(parcel.readInt(), parcel.readLong()));
            }
            this.f8799f = Collections.unmodifiableList(arrayList);
            this.f8798e = parcel.readLong();
            this.f8800g = parcel.readByte() == 1;
            this.f8801h = parcel.readLong();
            this.f8802i = parcel.readInt();
            this.f8803j = parcel.readInt();
            this.f8804k = parcel.readInt();
        }
    }
}
