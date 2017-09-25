package structires.tree;

import structires.collections.Collections;

/**
 * Created : zzc
 * Time : 2017/9/25
 * Email : zzcm159@gmail.com
 * Description :
 */

public interface Tree<E> extends Collections<E> {
    void union(E nodeA, E nodeB);

    E findParent(E node);

    Collections<E> findChildren(E node);
}
