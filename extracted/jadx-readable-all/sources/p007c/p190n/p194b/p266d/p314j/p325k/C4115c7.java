package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* JADX INFO: renamed from: c.n.b.d.j.k.c7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4115c7<FieldDescriptorType> extends C4087a7<FieldDescriptorType, Object> {
    public C4115c7(int i) {
        super(i, null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4087a7
    /* JADX INFO: renamed from: c */
    public final void mo9348c() {
        if (!this.f23035j) {
            for (int i = 0; i < m9350e(); i++) {
                Map.Entry<FieldDescriptorType, Object> entryM9349d = m9349d(i);
                if (((InterfaceC4390w4) entryM9349d.getKey()).mo9437e()) {
                    entryM9349d.setValue(Collections.unmodifiableList((List) entryM9349d.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : m9352g()) {
                if (((InterfaceC4390w4) entry.getKey()).mo9437e()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo9348c();
    }
}
