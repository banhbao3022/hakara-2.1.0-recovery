package p524h1;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: h1.y, reason: use source file name */
/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JvmOkio3 extends AsyncTimeout {

    /* JADX INFO: renamed from: l */
    public final Logger f30755l;

    /* JADX INFO: renamed from: m */
    public final Socket f30756m;

    public JvmOkio3(Socket socket) {
        Intrinsics2.m13090f(socket, "socket");
        this.f30756m = socket;
        this.f30755l = Logger.getLogger("okio.Okio");
    }

    @Override // p524h1.AsyncTimeout
    /* JADX INFO: renamed from: j */
    public IOException mo13563j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // p524h1.AsyncTimeout
    /* JADX INFO: renamed from: k */
    public void mo13453k() {
        try {
            this.f30756m.close();
        } catch (AssertionError e) {
            if (!SkuDao.a.m14049A(e)) {
                throw e;
            }
            Logger logger = this.f30755l;
            Level level = Level.WARNING;
            StringBuilder sbM1556G = outline.m1556G("Failed to close timed out socket ");
            sbM1556G.append(this.f30756m);
            logger.log(level, sbM1556G.toString(), (Throwable) e);
        } catch (Exception e2) {
            Logger logger2 = this.f30755l;
            Level level2 = Level.WARNING;
            StringBuilder sbM1556G2 = outline.m1556G("Failed to close timed out socket ");
            sbM1556G2.append(this.f30756m);
            logger2.log(level2, sbM1556G2.toString(), (Throwable) e2);
        }
    }
}
