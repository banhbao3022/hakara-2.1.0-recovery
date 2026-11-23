package p007c.p085g.p086a.p089m.p090s;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: c.g.a.m.s.m, reason: use source file name */
/* JADX INFO: compiled from: ParcelFileDescriptorRewinder.java */
/* JADX INFO: loaded from: classes.dex */
public final class ParcelFileDescriptorRewinder implements DataRewinder<ParcelFileDescriptor> {

    /* JADX INFO: renamed from: a */
    public final b f3070a;

    /* JADX INFO: renamed from: c.g.a.m.s.m$a */
    /* JADX INFO: compiled from: ParcelFileDescriptorRewinder.java */
    public static final class a implements DataRewinder.a<ParcelFileDescriptor> {
        @Override // p007c.p085g.p086a.p089m.p090s.DataRewinder.a
        /* JADX INFO: renamed from: a */
        public Class<ParcelFileDescriptor> mo1724a() {
            return ParcelFileDescriptor.class;
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataRewinder.a
        /* JADX INFO: renamed from: b */
        public DataRewinder<ParcelFileDescriptor> mo1725b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.s.m$b */
    /* JADX INFO: compiled from: ParcelFileDescriptorRewinder.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final ParcelFileDescriptor f3071a;

        public b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f3071a = parcelFileDescriptor;
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f3070a = new b(parcelFileDescriptor);
    }

    @Override // p007c.p085g.p086a.p089m.p090s.DataRewinder
    /* JADX INFO: renamed from: b */
    public void mo1723b() {
    }

    @Override // p007c.p085g.p086a.p089m.p090s.DataRewinder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo1722a() throws IOException {
        b bVar = this.f3070a;
        Objects.requireNonNull(bVar);
        try {
            Os.lseek(bVar.f3071a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
            return bVar.f3071a;
        } catch (ErrnoException e) {
            throw new IOException(e);
        }
    }
}
