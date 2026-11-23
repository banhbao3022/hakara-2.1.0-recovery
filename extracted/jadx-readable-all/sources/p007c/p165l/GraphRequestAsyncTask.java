package p007c.p165l;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.net.HttpURLConnection;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.l.u, reason: use source file name */
/* JADX INFO: compiled from: GraphRequestAsyncTask.java */
/* JADX INFO: loaded from: classes.dex */
public class GraphRequestAsyncTask extends AsyncTask<Void, Void, List<GraphResponse>> {

    /* JADX INFO: renamed from: a */
    public static final String f5396a = GraphRequestAsyncTask.class.getCanonicalName();

    /* JADX INFO: renamed from: b */
    public final HttpURLConnection f5397b;

    /* JADX INFO: renamed from: c */
    public final GraphRequestBatch f5398c;

    /* JADX INFO: renamed from: d */
    public Exception f5399d;

    public GraphRequestAsyncTask(GraphRequest2... graphRequest2Arr) {
        this((HttpURLConnection) null, new GraphRequestBatch(graphRequest2Arr));
    }

    @Override // android.os.AsyncTask
    public List<GraphResponse> doInBackground(Void[] voidArr) throws Throwable {
        List<GraphResponse> listM2672g;
        try {
            HttpURLConnection httpURLConnection = this.f5397b;
            if (httpURLConnection == null) {
                GraphRequestBatch graphRequestBatch = this.f5398c;
                Objects.requireNonNull(graphRequestBatch);
                listM2672g = GraphRequest2.m2671f(graphRequestBatch);
            } else {
                listM2672g = GraphRequest2.m2672g(httpURLConnection, this.f5398c);
            }
            return listM2672g;
        } catch (Exception e) {
            this.f5399d = e;
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(List<GraphResponse> list) {
        super.onPostExecute(list);
        Exception exc = this.f5399d;
        if (exc != null) {
            String.format("onPostExecute: exception encountered during request: %s", exc.getMessage());
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        super.onPreExecute();
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        if (this.f5398c.f5401g == null) {
            this.f5398c.f5401g = Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper());
        }
    }

    public String toString() {
        StringBuilder sbM1561L = outline.m1561L("{RequestAsyncTask: ", " connection: ");
        sbM1561L.append(this.f5397b);
        sbM1561L.append(", requests: ");
        sbM1561L.append(this.f5398c);
        sbM1561L.append("}");
        return sbM1561L.toString();
    }

    public GraphRequestAsyncTask(Collection<GraphRequest2> collection) {
        this((HttpURLConnection) null, new GraphRequestBatch(collection));
    }

    public GraphRequestAsyncTask(GraphRequestBatch graphRequestBatch) {
        this((HttpURLConnection) null, graphRequestBatch);
    }

    public GraphRequestAsyncTask(HttpURLConnection httpURLConnection, GraphRequest2... graphRequest2Arr) {
        this(httpURLConnection, new GraphRequestBatch(graphRequest2Arr));
    }

    public GraphRequestAsyncTask(HttpURLConnection httpURLConnection, Collection<GraphRequest2> collection) {
        this(httpURLConnection, new GraphRequestBatch(collection));
    }

    public GraphRequestAsyncTask(HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
        this.f5398c = graphRequestBatch;
        this.f5397b = httpURLConnection;
    }
}
