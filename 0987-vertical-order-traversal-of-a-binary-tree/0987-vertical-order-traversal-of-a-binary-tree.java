class Solution {

    // Stores a node along with its position in the tree
    class Tuple {
        TreeNode node;
        int row;
        int col;

        Tuple(TreeNode node, int row, int col) {
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        /*
         * Structure:
         * Column -> Row -> Values
         *
         * TreeMap       : keeps columns sorted from left to right
         * Inner TreeMap : keeps rows sorted from top to bottom
         * PriorityQueue : sorts nodes having same row and column
         */
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map
                = new TreeMap<>();

        Queue<Tuple> q = new LinkedList<>();

        // Root starts at row = 0, column = 0
        q.add(new Tuple(root, 0, 0));

        // BFS traversal
        while (!q.isEmpty()) {

            Tuple t = q.poll();

            TreeNode node = t.node;
            int row = t.row;
            int col = t.col;

            // Create this column if it doesn't exist
            map.putIfAbsent(col, new TreeMap<>());

            // Create this row inside the column if it doesn't exist
            map.get(col)
               .putIfAbsent(row, new PriorityQueue<>());

            // Store node value at its (column, row)
            map.get(col)
               .get(row)
               .add(node.val);


            /*
             * Left child:
             * go one level down  -> row + 1
             * go one column left -> col - 1
             */
            if (node.left != null) {
                q.add(new Tuple(
                    node.left,
                    row + 1,
                    col - 1
                ));
            }


            /*
             * Right child:
             * go one level down   -> row + 1
             * go one column right -> col + 1
             */
            if (node.right != null) {
                q.add(new Tuple(
                    node.right,
                    row + 1,
                    col + 1
                ));
            }
        }


        List<List<Integer>> ans = new ArrayList<>();

        /*
         * Outer TreeMap automatically gives columns:
         * left -> right
         */
        for (TreeMap<Integer, PriorityQueue<Integer>> rows : map.values()) {

            List<Integer> column = new ArrayList<>();

            /*
             * Inner TreeMap automatically gives rows:
             * top -> bottom
             */
            for (PriorityQueue<Integer> pq : rows.values()) {

                /*
                 * PriorityQueue gives smaller value first
                 * when multiple nodes have same row + column.
                 */
                while (!pq.isEmpty()) {
                    column.add(pq.poll());
                }
            }

            ans.add(column);
        }

        return ans;
    }
}