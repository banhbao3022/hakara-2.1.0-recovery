package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.j.a.oi */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3363oi extends AbstractC2767a {
    public static final Parcelable.Creator<C3363oi> CREATOR = new C3400pi();

    /* JADX INFO: renamed from: f */
    public ParcelFileDescriptor f17626f;

    /* JADX INFO: renamed from: g */
    public Parcelable f17627g = null;

    /* JADX INFO: renamed from: h */
    public boolean f17628h = true;

    public C3363oi(ParcelFileDescriptor parcelFileDescriptor) {
        this.f17626f = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.f17626f == null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                this.f17627g.writeToParcel(parcelObtain, 0);
                final byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
                    try {
                        C2962do.f13330a.execute(new Runnable(autoCloseOutputStream, bArrMarshall) { // from class: c.n.b.d.j.a.mi

                            /* JADX INFO: renamed from: f */
                            public final OutputStream f16762f;

                            /* JADX INFO: renamed from: g */
                            public final byte[] f16763g;

                            {
                                this.f16762f = autoCloseOutputStream;
                                this.f16763g = bArrMarshall;
                            }

                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                OutputStream outputStream = this.f16762f;
                                byte[] bArr = this.f16763g;
                                Parcelable.Creator<C3363oi> creator = C3363oi.CREATOR;
                                DataOutputStream dataOutputStream = null;
                                try {
                                    DataOutputStream dataOutputStream2 = new DataOutputStream(outputStream);
                                    try {
                                        dataOutputStream2.writeInt(bArr.length);
                                        dataOutputStream2.write(bArr);
                                        try {
                                            dataOutputStream2.close();
                                        } catch (IOException unused) {
                                        }
                                    } catch (IOException e) {
                                        e = e;
                                        dataOutputStream = dataOutputStream2;
                                        C2622l.m5438t3("Error transporting the ad response", e);
                                        C2998en c2998en = C2330u.f10884a.f10893h;
                                        C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(e, "LargeParcelTeleporter.pipeData.1");
                                        if (dataOutputStream != null) {
                                            try {
                                                dataOutputStream.close();
                                            } catch (IOException unused2) {
                                            }
                                        } else if (outputStream != null) {
                                            try {
                                                outputStream.close();
                                            } catch (IOException unused3) {
                                            }
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        dataOutputStream = dataOutputStream2;
                                        try {
                                            if (dataOutputStream == null) {
                                                if (outputStream != null) {
                                                    outputStream.close();
                                                }
                                                throw th;
                                            }
                                            dataOutputStream.close();
                                        } catch (IOException unused4) {
                                        }
                                        throw th;
                                    }
                                } catch (IOException e2) {
                                    e = e2;
                                }
                            }
                        });
                        parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                    } catch (IOException e) {
                        e = e;
                        C2622l.m5438t3("Error transporting the ad response", e);
                        C2998en c2998en = C2330u.f10884a.f10893h;
                        C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(e, "LargeParcelTeleporter.pipeData.2");
                        if (autoCloseOutputStream != null) {
                            try {
                                autoCloseOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    autoCloseOutputStream = null;
                }
                this.f17626f = parcelFileDescriptor;
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5311T(parcel, 2, this.f17626f, i, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
