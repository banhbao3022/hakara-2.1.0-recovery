package p007c.p190n.p194b.p209b.p234u1.p236j;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: c.n.b.b.u1.j.c, reason: use source file name */
/* JADX INFO: compiled from: EventMessageEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class EventMessageEncoder {

    /* JADX INFO: renamed from: a */
    public final ByteArrayOutputStream f8686a;

    /* JADX INFO: renamed from: b */
    public final DataOutputStream f8687b;

    public EventMessageEncoder() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f8686a = byteArrayOutputStream;
        this.f8687b = new DataOutputStream(byteArrayOutputStream);
    }

    /* JADX INFO: renamed from: b */
    public static void m4020b(DataOutputStream dataOutputStream, long j2) throws IOException {
        dataOutputStream.writeByte(((int) (j2 >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j2 >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j2 >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j2) & 255);
    }

    /* JADX INFO: renamed from: a */
    public byte[] m4021a(EventMessage eventMessage) {
        this.f8686a.reset();
        try {
            DataOutputStream dataOutputStream = this.f8687b;
            dataOutputStream.writeBytes(eventMessage.f8680h);
            dataOutputStream.writeByte(0);
            String str = eventMessage.f8681i;
            if (str == null) {
                str = "";
            }
            DataOutputStream dataOutputStream2 = this.f8687b;
            dataOutputStream2.writeBytes(str);
            dataOutputStream2.writeByte(0);
            m4020b(this.f8687b, eventMessage.f8682j);
            m4020b(this.f8687b, eventMessage.f8683k);
            this.f8687b.write(eventMessage.f8684l);
            this.f8687b.flush();
            return this.f8686a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
