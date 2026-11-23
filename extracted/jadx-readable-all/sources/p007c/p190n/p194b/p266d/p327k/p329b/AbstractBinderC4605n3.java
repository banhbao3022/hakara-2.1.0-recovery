package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p325k.BinderC4373v0;
import p007c.p190n.p194b.p266d.p314j.p325k.C4385w;

/* JADX INFO: renamed from: c.n.b.d.k.b.n3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC4605n3 extends BinderC4373v0 implements InterfaceC4569k3 {
    public AbstractBinderC4605n3() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.BinderC4373v0
    /* JADX INFO: renamed from: E0 */
    public final boolean mo9388E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        ArrayList arrayList;
        switch (i) {
            case 1:
                ((BinderC4463b5) this).mo10405r5((C4625p) C4385w.m10296a(parcel, C4625p.CREATOR), (C4480ca) C4385w.m10296a(parcel, C4480ca.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                C4712w9 c4712w9 = (C4712w9) C4385w.m10296a(parcel, C4712w9.CREATOR);
                C4480ca c4480ca = (C4480ca) C4385w.m10296a(parcel, C4480ca.CREATOR);
                BinderC4463b5 binderC4463b5 = (BinderC4463b5) this;
                Objects.requireNonNull(c4712w9, "null reference");
                binderC4463b5.m10403q3(c4480ca);
                binderC4463b5.m10392T1(new RunnableC4642q5(binderC4463b5, c4712w9, c4480ca));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                C4480ca c4480ca2 = (C4480ca) C4385w.m10296a(parcel, C4480ca.CREATOR);
                BinderC4463b5 binderC4463b6 = (BinderC4463b5) this;
                binderC4463b6.m10403q3(c4480ca2);
                binderC4463b6.m10392T1(new RunnableC4664s5(binderC4463b6, c4480ca2));
                parcel2.writeNoException();
                return true;
            case 5:
                C4625p c4625p = (C4625p) C4385w.m10296a(parcel, C4625p.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                BinderC4463b5 binderC4463b7 = (BinderC4463b5) this;
                Objects.requireNonNull(c4625p, "null reference");
                C2622l.m5359e(string);
                binderC4463b7.m10391K2(string, true);
                binderC4463b7.m10392T1(new RunnableC4619o5(binderC4463b7, c4625p, string));
                parcel2.writeNoException();
                return true;
            case 6:
                C4480ca c4480ca3 = (C4480ca) C4385w.m10296a(parcel, C4480ca.CREATOR);
                BinderC4463b5 binderC4463b8 = (BinderC4463b5) this;
                binderC4463b8.m10403q3(c4480ca3);
                binderC4463b8.m10392T1(new RunnableC4499e5(binderC4463b8, c4480ca3));
                parcel2.writeNoException();
                return true;
            case 7:
                C4480ca c4480ca4 = (C4480ca) C4385w.m10296a(parcel, C4480ca.CREATOR);
                boolean z = parcel.readInt() != 0;
                BinderC4463b5 binderC4463b9 = (BinderC4463b5) this;
                binderC4463b9.m10403q3(c4480ca4);
                try {
                    List<C4734y9> list = (List) ((FutureTask) binderC4463b9.f23726f.mo10686n().m10756t(new CallableC4631p5(binderC4463b9, c4480ca4))).get();
                    arrayList = new ArrayList(list.size());
                    for (C4734y9 c4734y9 : list) {
                        if (z || !C4723x9.m10865r0(c4734y9.f24612c)) {
                            arrayList.add(new C4712w9(c4734y9));
                        }
                        break;
                    }
                } catch (InterruptedException | ExecutionException e) {
                    binderC4463b9.f23726f.mo10684l().f24418f.m10813c("Failed to get user properties. appId", C4662s3.m10738s(c4480ca4.f23798f), e);
                    arrayList = null;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                byte[] bArrMo10394X0 = ((BinderC4463b5) this).mo10394X0((C4625p) C4385w.m10296a(parcel, C4625p.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrMo10394X0);
                return true;
            case 10:
                ((BinderC4463b5) this).mo10393W2(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String strMo10402m2 = ((BinderC4463b5) this).mo10402m2((C4480ca) C4385w.m10296a(parcel, C4480ca.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(strMo10402m2);
                return true;
            case 12:
                ((BinderC4463b5) this).mo10400g6((C4624oa) C4385w.m10296a(parcel, C4624oa.CREATOR), (C4480ca) C4385w.m10296a(parcel, C4480ca.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                ((BinderC4463b5) this).m10401i1((C4624oa) C4385w.m10296a(parcel, C4624oa.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                ClassLoader classLoader = C4385w.f23577a;
                List<C4712w9> listMo10407v3 = ((BinderC4463b5) this).mo10407v3(string2, string3, parcel.readInt() != 0, (C4480ca) C4385w.m10296a(parcel, C4480ca.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo10407v3);
                return true;
            case 15:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                ClassLoader classLoader2 = C4385w.f23577a;
                List<C4712w9> listMo10390I1 = ((BinderC4463b5) this).mo10390I1(string4, string5, string6, parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo10390I1);
                return true;
            case 16:
                List<C4624oa> listMo10399g3 = ((BinderC4463b5) this).mo10399g3(parcel.readString(), parcel.readString(), (C4480ca) C4385w.m10296a(parcel, C4480ca.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo10399g3);
                return true;
            case 17:
                List<C4624oa> listMo10397b3 = ((BinderC4463b5) this).mo10397b3(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo10397b3);
                return true;
            case 18:
                C4480ca c4480ca5 = (C4480ca) C4385w.m10296a(parcel, C4480ca.CREATOR);
                BinderC4463b5 binderC4463b10 = (BinderC4463b5) this;
                binderC4463b10.m10391K2(c4480ca5.f23798f, false);
                binderC4463b10.m10392T1(new RunnableC4559j5(binderC4463b10, c4480ca5));
                parcel2.writeNoException();
                return true;
            case 19:
                ((BinderC4463b5) this).mo10406u5((Bundle) C4385w.m10296a(parcel, Bundle.CREATOR), (C4480ca) C4385w.m10296a(parcel, C4480ca.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                ((BinderC4463b5) this).mo10398d1((C4480ca) C4385w.m10296a(parcel, C4480ca.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
